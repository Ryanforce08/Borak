import java.util.Scanner;
public class Java11 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int j = 0;
		double loop = 1;
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			
		}
		while (j < 19) {
			System.out.print("give me a number: ");
			j = s.nextInt();
			System.out.println(j);
		}
		
		while(true) {
			   System.out.print("enter an int: ");
			   j = s.nextInt();
			   if (j == 20)
			      break;
		}
		while (true) {
			System.out.println("Loop: " + loop);
			loop *= 2;
		}
		
		
		

	}

}
