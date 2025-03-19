public class TimSort 
{
    private static final int MIN_MERGE = 32;
    private static final int  MIN_GALLOP = 7;
    private static final int INITIAL_TMP_STORAGE_LENGTH = 256;
    private static int stackSize = 0;

    public static void timSort(int[] a) 
    {
        int minGallop = MIN_GALLOP;
    
        int len = a.length;
        @SuppressWarnings({"unchecked", "UnnecessaryLocalVariable"})
        int[] newArray = (int[]) new int[len < 2 * INITIAL_TMP_STORAGE_LENGTH ?
                                        len >>> 1 : INITIAL_TMP_STORAGE_LENGTH];
        int[] tmp = newArray;
        
        
        int stackLen = (len <    120  ?  5 :
                        len <   1542  ? 10 :
                        len < 119151  ? 19 : 40);
        final int[] runBase = new int[stackLen];
        final int[] runLen = new int[stackLen];
        
        sort(a, 0, a.length, runBase, runLen, minGallop, tmp);
    }

    private static void sort(int[] a, int lo, int hi, int[] runbase, int[] runlen, 
                             int minGallop, int[] tmp) 
    {

        rangeCheck(a.length, lo, hi);
        int nRemaining  = hi - lo;
        if (nRemaining < 2)
            return;  // Arrays of size 0 and 1 are always sorted

        // If array is small, do a "mini-TimSort" with no merges
        if (nRemaining < MIN_MERGE) 
        {
            int initRunLen = countRunAndMakeAscending(a, lo, hi);
            binarySort(a, lo, hi, lo + initRunLen);
            return;
        }

        int minRun = minRunLength(nRemaining);
        do 
        {
            // Identify next run
            int runLen = countRunAndMakeAscending(a, lo, hi);

            // If run is short, extend to min(minRun, nRemaining)
            if (runLen < minRun) 
            {
                int force = nRemaining <= minRun ? nRemaining : minRun;
                binarySort(a, lo, lo + force, lo + runLen);
                runLen = force;
            }

            // Push run onto pending-run stack, and maybe merge
            runbase[stackSize] = lo;
            runlen[stackSize] = runLen;
            stackSize++;
            
            mergeCollapse(a, runbase, runlen, minGallop, tmp);

            // Advance to find next run
            lo += runLen;
            nRemaining -= runLen;
        } 
        while (nRemaining != 0);

        // Merge all remaining runs to complete sort
        assert lo == hi;
        mergeForceCollapse(a, runbase, runlen, minGallop, tmp);
        assert stackSize == 1;
    }

    @SuppressWarnings("fallthrough")
    private static void binarySort(int[] a, int lo, int hi, int start) 
    {
        assert lo <= start && start <= hi;
        if (start == lo)
            start++;
        for ( ; start < hi; start++) 
        {
            int pivot = a[start];

            // Set left (and right) to the index where a[start] (pivot) belongs
            int left = lo;
            int right = start;
            assert left <= right;
            /*
             * Invariants:
             *   pivot >= all in [lo, left).
             *   pivot <  all in [right, start).
             */
            while (left < right) 
            {
                int mid = (left + right) >>> 1;
                if (pivot < a[mid])
                    right = mid;
                else
                    left = mid + 1;
            }
            assert left == right;

            int n = start - left;  // The number of elements to move
            // Switch is just an optimization for arraycopy in default case
            switch(n) 
            {
                case 2:  a[left + 2] = a[left + 1];
                case 1:  a[left + 1] = a[left];
                         break;
                default: System.arraycopy(a, left, a, left + 1, n);
            }
            a[left] = pivot;
        }
    }

    private static int countRunAndMakeAscending(int[] a, int lo, int hi) 
    {
        assert lo < hi;
        int runHi = lo + 1;
        if (runHi == hi)
            return 1;

        // Find end of run, and reverse range if descending
        if (a[runHi++] < a[lo]) 
        { // Descending
            while(runHi < hi && a[runHi] < a[runHi - 1])
                runHi++;
            reverseRange(a, lo, runHi);
        } 
        else 
        {                              // Ascending
            while (runHi < hi && a[runHi] >= a[runHi - 1])
                runHi++;
        }

        return runHi - lo;
    }

    private static void reverseRange(int[] a, int lo, int hi) 
    {
        hi--;
        while (lo < hi) 
        {
            int t = a[lo];
            a[lo++] = a[hi];
            a[hi--] = t;
        }
    }

    private static int minRunLength(int n) 
    {
        assert n >= 0;
        int r = 0;      // Becomes 1 if any 1 bits are shifted off
        while (n >= MIN_MERGE) 
        {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }

    private static void mergeCollapse(int[] a, int[] runBase, int[] runLen, 
                                      int minGallop, int[] tmp) 
    {
        while (stackSize > 1) 
        {
            int n = stackSize - 2;
            if (n > 0 && runLen[n-1] <= runLen[n] + runLen[n+1]) 
            {
                if (runLen[n - 1] < runLen[n + 1])
                    n--;
                mergeAt(a, n, runBase, runLen, minGallop, tmp);
            } 
            else if (runLen[n] <= runLen[n + 1]) 
            {
                mergeAt(a, n, runBase, runLen, minGallop, tmp);
            } 
            else 
            {
                break; // Invariant is established
            }
        }
    }

    private static void mergeForceCollapse(int[] a, int[] runBase, int[] runLen, 
                                           int minGallop, int[] tmp) 
    {
        while (stackSize > 1) 
        {
            int n = stackSize - 2;
            if (n > 0 && runLen[n - 1] < runLen[n + 1])
                n--;
            mergeAt(a, n, runBase, runLen, minGallop, tmp);
        }
    }

    private static void mergeAt(int[] a, int i, int[] runBase, int[] runLen, 
                                int minGallop, int[] tmp) 
    {
        assert stackSize >= 2;
        assert i >= 0;
        assert i == stackSize - 2 || i == stackSize - 3;

        int base1 = runBase[i];
        int len1 = runLen[i];
        int base2 = runBase[i + 1];
        int len2 = runLen[i + 1];
        assert len1 > 0 && len2 > 0;
        assert base1 + len1 == base2;

        runLen[i] = len1 + len2;
        if (i == stackSize - 3) 
        {
            runBase[i + 1] = runBase[i + 2];
            runLen[i + 1] = runLen[i + 2];
        }
        stackSize--;

        int k = gallopRight(a[base2], a, base1, len1, 0);
        assert k >= 0;
        base1 += k;
        len1 -= k;
        if (len1 == 0)
            return;

        len2 = gallopLeft(a[base1 + len1 - 1], a, base2, len2, len2 - 1);
        assert len2 >= 0;
        if (len2 == 0)
            return;

        // Merge remaining runs, using tmp array with min(len1, len2) elements
        if (len1 <= len2)
            mergeLo(a, base1, len1, base2, len2, minGallop, tmp);
        else
            mergeHi(a, base1, len1, base2, len2, minGallop, tmp);
    }

    private static int gallopLeft(int key, int[] a, int base, int len, int hint) 
    {
        assert len > 0 && hint >= 0 && hint < len;
        int lastOfs = 0;
        int ofs = 1;
        if (key > a[base + hint]) 
        {
            // Gallop right until a[base+hint+lastOfs] < key <= a[base+hint+ofs]
            int maxOfs = len - hint;
            while (ofs < maxOfs && key > a[base + hint + ofs]) 
            {
                lastOfs = ofs;
                ofs = (ofs << 1) + 1;
                if (ofs <= 0)   // int overflow
                    ofs = maxOfs;
            }
            if (ofs > maxOfs)
                ofs = maxOfs;

            // Make offsets relative to base
            lastOfs += hint;
            ofs += hint;
        } 
        else 
        {
            // key <= a[base + hint]
            // Gallop left until a[base+hint-ofs] < key <= a[base+hint-lastOfs]
            final int maxOfs = hint + 1;
            while (ofs < maxOfs && key <= a[base + hint - ofs]) 
            {
                lastOfs = ofs;
                ofs = (ofs << 1) + 1;
                if (ofs <= 0)   // int overflow
                    ofs = maxOfs;
            }
            if (ofs > maxOfs)
                ofs = maxOfs;

            // Make offsets relative to base
            int tmp = lastOfs;
            lastOfs = hint - ofs;
            ofs = hint - tmp;
        }
        assert -1 <= lastOfs && lastOfs < ofs && ofs <= len;

        lastOfs++;
        while (lastOfs < ofs) 
        {
            int m = lastOfs + ((ofs - lastOfs) >>> 1);

            if (key > a[base + m])
                lastOfs = m + 1;  // a[base + m] < key
            else
                ofs = m;          // key <= a[base + m]
        }
        assert lastOfs == ofs;    // so a[base + ofs - 1] < key <= a[base + ofs]
        return ofs;
    }

    private static int gallopRight(int key, int[] a, int base, int len, int hint) 
    {
        assert len > 0 && hint >= 0 && hint < len;

        int ofs = 1;
        int lastOfs = 0;
        if (key < a[base + hint]) 
        {
            // Gallop left until a[b+hint - ofs] <= key < a[b+hint - lastOfs]
            int maxOfs = hint + 1;
            while (ofs < maxOfs && key < a[base + hint - ofs]) 
            {
                lastOfs = ofs;
                ofs = (ofs << 1) + 1;
                if (ofs <= 0)   // int overflow
                    ofs = maxOfs;
            }
            if (ofs > maxOfs)
                ofs = maxOfs;

            // Make offsets relative to b
            int tmp = lastOfs;
            lastOfs = hint - ofs;
            ofs = hint - tmp;
        } 
        else 
        { // a[b + hint] <= key
            // Gallop right until a[b+hint + lastOfs] <= key < a[b+hint + ofs]
            int maxOfs = len - hint;
            while (ofs < maxOfs && key >= a[base + hint + ofs]) 
            {
                lastOfs = ofs;
                ofs = (ofs << 1) + 1;
                if (ofs <= 0)   // int overflow
                    ofs = maxOfs;
            }
            if (ofs > maxOfs)
                ofs = maxOfs;

            // Make offsets relative to b
            lastOfs += hint;
            ofs += hint;
        }
        assert -1 <= lastOfs && lastOfs < ofs && ofs <= len;

        lastOfs++;
        while (lastOfs < ofs) 
        {
            int m = lastOfs + ((ofs - lastOfs) >>> 1);

            if (key < a[base + m])
                ofs = m;          // key < a[b + m]
            else
                lastOfs = m + 1;  // a[b + m] <= key
        }
        assert lastOfs == ofs;    // so a[b + ofs - 1] <= key < a[b + ofs]
        return ofs;
    }

    private static void mergeLo(int[] a, int base1, int len1, int base2, 
                                int len2, int minGallop, int[] temp) 
    {
        assert len1 > 0 && len2 > 0 && base1 + len1 == base2;

        // Copy first run into temp array
        int[] tmp = ensureCapacity(a, len1, temp);
        System.arraycopy(a, base1, tmp, 0, len1);

        int cursor1 = 0;       // Indexes into tmp array
        int cursor2 = base2;   // Indexes int a
        int dest = base1;      // Indexes int a

        // Move first element of second run and deal with degenerate cases
        a[dest++] = a[cursor2++];
        if (--len2 == 0) 
        {
            System.arraycopy(tmp, cursor1, a, dest, len1);
            return;
        }
        if (len1 == 1) 
        {
            System.arraycopy(a, cursor2, a, dest, len2);
            a[dest + len2] = tmp[cursor1]; // Last elt of run 1 to end of merge
            return;
        }

        outer:
        while (true) 
        {
            int count1 = 0; // Number of times in a row that first run won
            int count2 = 0; // Number of times in a row that second run won

            do 
            {
                assert len1 > 1 && len2 > 0;
                if (a[cursor2] < tmp[cursor1]) 
                {
                    a[dest++] = a[cursor2++];
                    count2++;
                    count1 = 0;
                    if (--len2 == 0)
                        break outer;
                } 
                else 
                {
                    a[dest++] = tmp[cursor1++];
                    count1++;
                    count2 = 0;
                    if (--len1 == 1)
                        break outer;
                }
            } 
            while ((count1 | count2) < minGallop);

            do 
            {
                assert len1 > 1 && len2 > 0;
                count1 = gallopRight(a[cursor2], tmp, cursor1, len1, 0);
                if (count1 != 0) 
                {
                    System.arraycopy(tmp, cursor1, a, dest, count1);
                    dest += count1;
                    cursor1 += count1;
                    len1 -= count1;
                    if (len1 <= 1) // len1 == 1 || len1 == 0
                        break outer;
                }
                a[dest++] = a[cursor2++];
                if (--len2 == 0)
                    break outer;

                count2 = gallopLeft(tmp[cursor1], a, cursor2, len2, 0);
                if (count2 != 0) 
                {
                    System.arraycopy(a, cursor2, a, dest, count2);
                    dest += count2;
                    cursor2 += count2;
                    len2 -= count2;
                    if (len2 == 0)
                        break outer;
                }
                a[dest++] = tmp[cursor1++];
                if (--len1 == 1)
                    break outer;
                minGallop--;
            } 
            while (count1 >= MIN_GALLOP | count2 >= MIN_GALLOP);
            if (minGallop < 0)
                minGallop = 0;
            minGallop += 2;  // Penalize for leaving gallop mode
        }  // End of "outer" loop
        minGallop = minGallop < 1 ? 1 : minGallop;  // Write back to field

        if (len1 == 1) 
        {
            assert len2 > 0;
            System.arraycopy(a, cursor2, a, dest, len2);
            a[dest + len2] = tmp[cursor1]; //  Last elt of run 1 to end of merge
        } 
        else if (len1 == 0) 
        {
            throw new IllegalArgumentException(
                "Comparison method violates its general contract!");
        } 
        else 
        {
            assert len2 == 0;
            assert len1 > 1;
            System.arraycopy(tmp, cursor1, a, dest, len1);
        }
    }

    private static void mergeHi(int[] a, int base1, int len1, int base2, int len2, 
                                int minGallop, int[] temp) 
    {
        assert len1 > 0 && len2 > 0 && base1 + len1 == base2;

        // Copy second run into temp array
        int[] tmp = ensureCapacity(a, len2, temp);
        System.arraycopy(a, base2, tmp, 0, len2);

        int cursor1 = base1 + len1 - 1;  // Indexes into a
        int cursor2 = len2 - 1;          // Indexes into tmp array
        int dest = base2 + len2 - 1;     // Indexes into a

        // Move last element of first run and deal with degenerate cases
        a[dest--] = a[cursor1--];
        if (--len1 == 0) 
        {
            System.arraycopy(tmp, 0, a, dest - (len2 - 1), len2);
            return;
        }
        if (len2 == 1) 
        {
            dest -= len1;
            cursor1 -= len1;
            System.arraycopy(a, cursor1 + 1, a, dest + 1, len1);
            a[dest] = tmp[cursor2];
            return;
        }

        outer:
        while (true) 
        {
            int count1 = 0; // Number of times in a row that first run won
            int count2 = 0; // Number of times in a row that second run won

            do 
            {
                assert len1 > 0 && len2 > 1;
                if (tmp[cursor2] < a[cursor1]) 
                {
                    a[dest--] = a[cursor1--];
                    count1++;
                    count2 = 0;
                    if (--len1 == 0)
                        break outer;
                } 
                else 
                {
                    a[dest--] = tmp[cursor2--];
                    count2++;
                    count1 = 0;
                    if (--len2 == 1)
                        break outer;
                }
            } 
            while ((count1 | count2) < minGallop);

            do 
            {
                assert len1 > 0 && len2 > 1;
                count1 = len1 - gallopRight(tmp[cursor2], a, base1, len1, len1 - 1);
                if (count1 != 0) 
                {
                    dest -= count1;
                    cursor1 -= count1;
                    len1 -= count1;
                    System.arraycopy(a, cursor1 + 1, a, dest + 1, count1);
                    if (len1 == 0)
                        break outer;
                }
                a[dest--] = tmp[cursor2--];
                if (--len2 == 1)
                    break outer;

                count2 = len2 - gallopLeft(a[cursor1], tmp, 0, len2, len2 - 1);
                if (count2 != 0) 
                {
                    dest -= count2;
                    cursor2 -= count2;
                    len2 -= count2;
                    System.arraycopy(tmp, cursor2 + 1, a, dest + 1, count2);
                    if (len2 <= 1)  // len2 == 1 || len2 == 0
                        break outer;
                }
                a[dest--] = a[cursor1--];
                if (--len1 == 0)
                    break outer;
                minGallop--;
            } 
            while (count1 >= MIN_GALLOP | count2 >= MIN_GALLOP);
            
            if (minGallop < 0)
                minGallop = 0;
            minGallop += 2;  // Penalize for leaving gallop mode
        }  // End of "outer" loop
        minGallop = minGallop < 1 ? 1 : minGallop;  // Write back to field

        if (len2 == 1) 
        {
            assert len1 > 0;
            dest -= len1;
            cursor1 -= len1;
            System.arraycopy(a, cursor1 + 1, a, dest + 1, len1);
            a[dest] = tmp[cursor2];  // Move first elt of run2 to front of merge
        } 
        else if (len2 == 0) 
        {
            throw new IllegalArgumentException(
                "Comparison method violates its general contract!");
        } 
        else 
        {
            assert len1 == 0;
            assert len2 > 0;
            System.arraycopy(tmp, 0, a, dest - (len2 - 1), len2);
        }
    }

    private static int[] ensureCapacity(int[] a, int minCapacity, int[] tmp) 
    {
        if (tmp.length < minCapacity) 
        {
            int newSize = minCapacity;
            newSize |= newSize >> 1;
            newSize |= newSize >> 2;
            newSize |= newSize >> 4;
            newSize |= newSize >> 8;
            newSize |= newSize >> 16;
            newSize++;

            if (newSize < 0) // Not bloody likely!
                newSize = minCapacity;
            else
                newSize = Math.min(newSize, a.length >>> 1);

            @SuppressWarnings({"unchecked", "UnnecessaryLocalVariable"})
            int[] newArray = (int[]) new int[newSize];
            tmp = newArray;
        }
        return tmp;
    }

    private static void rangeCheck(int arrayLen, int fromIndex, int toIndex) 
    {
        if (fromIndex > toIndex)
            throw new IllegalArgumentException("fromIndex(" + fromIndex +
                       ") > toIndex(" + toIndex+")");
        if (fromIndex < 0)
            throw new ArrayIndexOutOfBoundsException(fromIndex);
        if (toIndex > arrayLen)
            throw new ArrayIndexOutOfBoundsException(toIndex);
    }
}