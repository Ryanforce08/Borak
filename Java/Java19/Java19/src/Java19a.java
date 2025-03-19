import java.util.*;

public class Java19a {
	public static void insertionSort(int[] a)
	{
	    for (int i = 1; i < a.length; i++)
	    {
	        int temp = a[i];
	        int j;
	        for (j = i - 1; j >=0 && temp < a[j]; j--)
	            a[j + 1] = a[j];
	        a[j + 1] = temp;
	    }
	}

	public static void main(String[] args) {
		int arr[] = new int[1000];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 1001 - 1);
		}
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
