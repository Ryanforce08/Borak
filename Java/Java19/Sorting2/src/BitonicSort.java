public class BitonicSort
{
    private final static boolean ASCENDING = true;
    
    private static void bitonicSort(int lo, int n, boolean dir, int[] a)
    {
        if (n>1)
        {
            int m=n/2;
            bitonicSort(lo, m, !dir, a);
            bitonicSort(lo + m, n - m, dir, a);
            bitonicMerge(lo, n, dir, a);
        }
    }

    private static void bitonicMerge(int lo, int n, boolean dir, int[] a)
    {
        if (n > 1)
        {
            int m=greatestPowerOfTwoLessThan(n);
            for (int i = lo; i < lo + n - m; i++)
                bitonicCompare(i, i + m, dir, a);
            bitonicMerge(lo, m, dir, a);
            bitonicMerge(lo + m, n - m, dir, a);
        }
    }

    private static void bitonicCompare(int i, int j, boolean dir, int[] a)
    {
        if (dir == (a[i] > a[j]))
            bitonicExchange(i, j, a);
    }

    private static void bitonicExchange(int i, int j, int[] a)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static int greatestPowerOfTwoLessThan(int n)
    {
        int k = 1;
        while (k < n)
            k = k << 1;
        return k >> 1;
    }
    
    public static void bitonicSort(int[] a)
    {
        bitonicSort(0, a.length, ASCENDING, a);
    }

}