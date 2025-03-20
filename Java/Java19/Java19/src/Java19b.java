import java.util.*;

public class Java19b {

	public static void bubbleSort(ArrayList <Integer> a)
    {
        int swap;
        for (int c = 0; c < a.size() - 1; c++) 
        {
            for (int d = 0; d < a.size() - c - 1; d++) 
            {
                if (a.get(d) > a.get(d + 1)) /* For descending order use < */
                {
                    swap = a.get(d);
                    a.set(d, a.get(d+1));
                    a.set(d+1, swap);
                }
            } 
        }
    }

	public static void main(String[] args) {
		ArrayList <Integer> arr = new ArrayList <Integer> ();
		for (int i = 0; i < 1000; i++) {
			arr.add((int) (Math.random() * 1001));
		}
		bubbleSort(arr);
		System.out.println(arr);

	}


}
