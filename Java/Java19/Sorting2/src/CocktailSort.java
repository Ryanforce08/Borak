public class CocktailSort
{
    public static void cocktailSort(int[] a)
    {
        boolean swapped;
        do 
        {
            swapped = false;
            for (int i = 0; i <= a.length  - 2; i++) 
            {
                if (a[i] > a[i + 1]) 
                {
                    //test whether the two elements are in the wrong order
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) 
            {
                //we can exit the outer loop here if no swaps occurred.
                break;
            }
            swapped = false;
            for (int i = a.length - 2; i >= 0; i--) 
            {
                if (a[ i ] > a[i + 1]) 
                {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            //if no elements have been swapped, then the list is sorted
        } 
        while (swapped);
    }
}