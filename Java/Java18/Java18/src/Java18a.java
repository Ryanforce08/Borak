import java.util.*;
public class Java18a {
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
		ArrayList <Integer> arr = new ArrayList <Integer>();
		int j = 0;
		
		for (int i = 0; j < 100; i++) {
			if (isPrime(i)) {
				arr.add(i);
				j++;
			}
		}
				
		System.out.println(arr);
		
		

	}
}
