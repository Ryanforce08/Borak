
import java.util.*;
public class Java21 {
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
		ArrayList <Integer> al = new ArrayList <Integer> ();
		ArrayList <Integer> mode = new ArrayList <Integer> ();
		int count1 = 1;
		int count2 = 1;

		
		for (int i = 0; i < 15; i++) {
		    al.add((int) ((Math.random() * 11)* 1.0));
		}	
		bubbleSort(al);

		
		
		for (int i = 0;i< al.size() - 1;i++) {
			if (al.get(i) == al.get(i + 1))
					count1++;
			if (al.get(i) != al.get(i + 1))
					count1 = 1;
			if (count2 < count1)
				count2++;
		}
		count1 = 1;
		for (int j = 0;j< al.size() - 1;j++) {
			if (al.get(j) == al.get(j + 1))
					count1++;
			if (al.get(j) != al.get(j + 1))
					count1 = 1;
			if (count2 == count1)
				mode.add(al.get(j));
		}
		System.out.println(al);
		System.out.println(mode);

	}

}
	
