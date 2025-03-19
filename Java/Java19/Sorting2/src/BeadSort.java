public class BeadSort
{
    public static void beadSort(int[] a)
    {
        int max = 0;
        for(int i = 0; i < a.length; i++)
            if(a[i] > max)
                max = a[i];
 
        //Set up abacus
        char[][] grid = new char[a.length][max];
        int[] levelcount = new int[max];
        for(int i = 0; i < max; i++)
        {
            levelcount[i] = 0;
            for(int j = 0; j < a.length; j++)
                grid[j][i] = '_';
        }
 
        //Drop the beads
        for(int i = 0; i < a.length; i++)
        {
            int num = a[i];
            for(int j = 0; num > 0; j++)
            {
                grid[levelcount[j]++][j] = '*';
                num--;
            }
        }
        //Count the beads
        int[] sorted = new int[a.length];
        for(int i = 0; i < a.length; i++)
        {
            int putt = 0;
            for(int j = 0; j < max && grid[a.length - 1 - i][j] == '*'; j++)
                putt++;
            a[i] = putt;
        }
    }
}