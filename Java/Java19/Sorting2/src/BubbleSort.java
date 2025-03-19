public class BubbleSort
{
    public static void bubbleSort(int[] a)
    {
        int swap;
        for (int c = 0; c < a.length - 1; c++) 
        {
            for (int d = 0; d < a.length - c - 1; d++) 
            {
                if (a[d] > a[d+1]) /* For descending order use < */
                {
                    swap = a[d];
                    a[d] = a[d + 1];
                    a[d + 1] = swap;
                }
            } 
        }
    }
}