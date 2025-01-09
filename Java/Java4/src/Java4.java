import java.util.Scanner;

public class Java4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int age = s.nextInt();
		System.out.print("Please enter your name: ");
		String dummy = s.nextLine();
		String name = s.nextLine();
		System.out.println(name + " is " + age + " years old");

	}

}
