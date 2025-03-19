import java.util.*;
public class Java16 {

	public static boolean isPrime (int n) 
	{
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input num: ");
		int input = s.nextInt();
		s.close();
		System.out.print(isPrime(input));
	}

}
