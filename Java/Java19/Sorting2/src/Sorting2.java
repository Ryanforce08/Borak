import java.util.*;

public class Sorting2
{
    public static void main (String[] args)
    {
        Random gen = new Random();
        
        long starttime;
        long endtime;
        long totaltime;
        
        final int MAX = 500000;
        
        int[] array1 = new int[MAX];
        int[] array2 = new int[MAX];
        int[] array3 = new int[MAX];
        int[] array4 = new int[MAX];
        int[] array5 = new int[MAX];
        int[] array6 = new int[MAX];
        int[] array7 = new int[MAX];
        int[] array8 = new int[MAX];
        int[] array9 = new int[MAX];
        int[] array10 = new int[MAX];
        int[] array11 = new int[MAX];
        int[] array12 = new int[MAX];
        int[] array13 = new int[MAX];
        int[] array14 = new int[MAX];
        int[] array15 = new int[MAX];
        int[] array16 = new int[MAX];
        int[] array17 = new int[MAX];
        int[] array18 = new int[MAX];
        int[] array19 = new int[MAX];
        int[] array20 = new int[MAX];
        int[] array21 = new int[MAX];
        int[] array22 = new int[MAX];
        int[] array23 = new int[MAX];
        int[] array24 = new int[MAX];
        
        for (int i = 0; i < MAX; i++)
        {
            int x = gen.nextInt(MAX);
            array1[i] = x;
            array2[i] = x;
            array3[i] = x;
            array4[i] = x;
            array5[i] = x;
            array6[i] = x;
            array7[i] = x;
            array8[i] = x;
            array9[i] = x;
            array10[i] = x;
            array11[i] = x;
            array12[i] = x;
            array13[i] = x;
            array14[i] = x;
            array15[i] = x;
            array16[i] = x;
            array17[i] = x;
            array18[i] = x;
            array19[i] = x;
            array20[i] = x;
            array21[i] = x;
            array22[i] = x;
            array23[i] = x;
            array24[i] = x;
        }
        
        starttime = System.currentTimeMillis();
        //BubbleSort.bubbleSort(array1);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Bubble Sort");
        
        starttime = System.currentTimeMillis();
        //SelectionSort.selectionSort(array2);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Selection Sort");
       
        starttime = System.currentTimeMillis();
        //InsertionSort.insertionSort(array3);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Insertion Sort");
        
        starttime = System.currentTimeMillis();
        MergeSort.mergeSort(array4);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Merge Sort");
        
        starttime = System.currentTimeMillis();
        QuickSort.quickSort(array5);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Quick Sort");
        
        starttime = System.currentTimeMillis();
        ShellSort.shellSort(array6);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Shell Sort");
        
        starttime = System.currentTimeMillis();
        HeapSort.heapSort(array7);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Heap Sort");
        
        starttime = System.currentTimeMillis();
        //GnomeSort.gnomeSort(array8);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Gnome Sort");
   
        starttime = System.currentTimeMillis();
        CombSort.combSort(array9);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Comb Sort");
        
        starttime = System.currentTimeMillis();
        //CocktailSort.cocktailSort(array10);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Cocktail Sort");
        
        starttime = System.currentTimeMillis();
        JSort.jSort(array11);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete JSort");
        
        starttime = System.currentTimeMillis();
        LSDRadixSort.lsdRadixSort(array12);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete LSD Radix Sort");
        
        starttime = System.currentTimeMillis();
        MSDRadixSort.msdRadixSort(array13);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete MSD Radix Sort");
        
        starttime = System.currentTimeMillis();
        SmoothSort.smoothSort(array14);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Smooth Sort");
        
        starttime = System.currentTimeMillis();
        Arrays.sort(array15);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Arrays.sort");
        
        starttime = System.currentTimeMillis();
        //CycleSort.cycleSort(array16);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Cycle Sort");
        
        starttime = System.currentTimeMillis();
        //OddEvenSort.oddEvenSort(array17);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Odd-Even Sort");
        
        starttime = System.currentTimeMillis();
        BitonicSort.bitonicSort(array18);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Bitonic Sort");
        
        starttime = System.currentTimeMillis();
        IntroSort.introSort(array19);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Intro Sort");
        
        starttime = System.currentTimeMillis();
        TimSort.timSort(array20);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Tim Sort");
        
        starttime = System.currentTimeMillis();
        //BeadSort.beadSort(array21);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Bead Sort");
        
        starttime = System.currentTimeMillis();
        //BogoSort.bogoSort(array22);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Bogo Sort"); 
        
        starttime = System.currentTimeMillis();
        //StoogeSort.stoogeSort(array23);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Stooge Sort"); 
        
        starttime = System.currentTimeMillis();
        //SlowSort.slowSort(array24);
        endtime = System.currentTimeMillis();
        totaltime = endtime - starttime;
        System.out.println(totaltime + " milliseconds to complete Slow Sort");
        
        for (int i = 0; i < MAX; i++)
        {
            //System.out.print(array1[i] + " ");
            //System.out.print(array2[i] + " ");
            //System.out.print(array3[i] + " ");
            //System.out.print(array4[i] + " ");
            //System.out.print(array5[i] + " ");
            //System.out.print(array6[i] + " ");
            //System.out.print(array7[i] + " ");
            //System.out.print(array8[i] + " ");
            //System.out.print(array9[i] + " ");
            //System.out.print(array10[i] + " ");
            //System.out.print(array11[i] + " ");
            //System.out.print(array12[i] + " ");
            //System.out.print(array13[i] + " ");
            //System.out.print(array14[i] + " ");
            //System.out.print(array15[i] + " ");
            //System.out.print(array16[i] + " ");
            //System.out.print(array17[i] + " ");
            //System.out.print(array18[i] + " ");
            //System.out.print(array19[i] + " ");
            //System.out.print(array20[i] + " ");
            //System.out.print(array21[i] + " ");
            //System.out.print(array22[i] + " ");
            //System.out.print(array23[i] + " ");
            //System.out.print(array23[i] + " ");
        }
        System.out.println();

    }
}