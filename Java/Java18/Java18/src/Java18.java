import java.util.ArrayList;
public class Java18 {
	public static void main( String[] args) {
		ArrayList <Integer> al = new ArrayList <Integer> ();
		for (int i = 0; i < 100; i++)
		   al.add(i);
		
		System.out.println(al.get(2));
		al.add(101);
		System.out.println(al);
		al.add(0,-1);
		System.out.println(al);
		al.set(1, 4);
		System.out.println(al);
		System.out.println(al.size());
		al.remove(0);
		System.out.println(al);
		System.out.println(al.indexOf(2));
		System.out.println(al.isEmpty());
		System.out.println(al.contains(2));
		
	}
}
