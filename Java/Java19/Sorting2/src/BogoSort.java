public class BogoSort
{
    public static void bogoSort(int[] a)
    {
        //Keep a track of the number of shuffles
        int shuffle = 1;
        for(; !bogoIsSorted(a); shuffle++)
            bogoShuffle(a);
    }
    
    private static void bogoShuffle(int[] a)
    {
        //Standard Fisher-Yates shuffle algorithm
        int i = a.length - 1;
        while(i > 0)
            bogoSwap(a, i--, (int)(Math.random() * i));
    }
    
    private static void bogoSwap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    private static boolean bogoIsSorted(int[] a)
    {
        for(int i = 1; i < a.length; i++)
            if(a[i] < a[i - 1])
                return false;
        return true;
    }
}