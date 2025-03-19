import java.util.*;
public class java16a {
	
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
		int[] arr = new int[100];
		int j = 0;
		
		for (int i = 0; j < arr.length; i++) {
			if (isPrime(i)) {
				arr[j] = i;
				j++;
			}
		}
				
		System.out.println(Arrays.toString(arr));
		
		

	}

}
