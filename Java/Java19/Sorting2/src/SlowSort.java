public class SlowSort
{
    public static void slowSort(int[] a) 
    {
        slowSort(a, 0, a.length);
    }
    
    private static void slowSort(int[] a, int i, int j) 
    {   
        /* Slow-sorts the subarray a[i] ... a[j-1] with the following procedure:
         * 
         * 1) Find the maximum of the sublist, and swap it into the last position.
         * 2) slowSort the rest of the array.
         * 
         * Step 1 can be further decomposed as follows:
         * 
         * 1.1) Let n = j - i.  Find the maximum of the first n / 2 elements by slowSort.
         * 1.2) Find the maximum of the rest of the elements by slowSort.
         * 1.3) Return the maximum of the two maxima.
         */
        
        final int n = j - i;
        
        if (n <= 1) 
            return;
        
        /* Step 1. */
        int k = i + n / 2;
        slowSort(a, i, k);
        slowSort(a, k, j);
        if (a[--k] > a[--j]) 
        {
            int tmp = a[j];
            a[j] = a[k];
            a[k] = tmp;
        }
        
        /* Step 2. */
        slowSort(a, i, j);
    }
}