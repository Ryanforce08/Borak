public class CombSort
{
    public static void combSort(int[] a) 
    {
        int gap = a.length;
        boolean swapped = true;
        while (gap > 1 || swapped) 
        {
            if (gap > 1) 
            {
                gap = (int) (gap / 1.3);
            }
            swapped = false;
            for (int i = 0; i + gap < a.length; i++) 
            {
                if (a[i] > a[i + gap]) 
                {
                    int t = a[i];
                    a[i] = a[i + gap];
                    a[i + gap] = t;
                    swapped = true;
                }
            }
        }
    }
}