public class QuickSort
{
    private static int partition(int a[], int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int pivot = a[(left + right) / 2];
     
        while (i <= j) 
        {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i <= j) 
            {
                tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
            }
        }
     
        return i;
    }
    
    public static void quickSort(int a[]) 
    {
        recursiveQuickSort(a, 0, a.length - 1);
    }
    
    private static void recursiveQuickSort(int a[], int left, int right) 
    {
        int index = partition(a, left, right);
        if (left < index - 1)
            recursiveQuickSort(a, left, index - 1);
        if (index < right)
            recursiveQuickSort(a, index, right);
    }
}