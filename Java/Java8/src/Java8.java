import java.util.Scanner;

public class Java8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x;
		String y;
		String dummy;
		System.out.print("Please enter a number: ");
		x = s.nextInt();
		System.out.print("Please enter a String: ");
		dummy = s.nextLine();
		y = s.nextLine();
		System.out.println(x + y);
		
		int i = 1;
		while (i != 20)
		{
		   System.out.print("Enter a number: ");
		   i = s.nextInt();
		}

	}

}
