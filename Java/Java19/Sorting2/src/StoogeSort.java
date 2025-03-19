public class StoogeSort
{
    public static void stoogeSort(int[] a) 
    {
        stoogeSort(a, 0, a.length - 1);
    }
 
    private static void stoogeSort(int[] a, int i, int j) 
    {
        if (a[j] < a[i]) 
        {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        if (j - i > 1) 
        {
            int t = (j - i + 1) / 3;
            stoogeSort(a, i, j - t);
            stoogeSort(a, i + t, j);
            stoogeSort(a, i, j - t);
        }
    }
}