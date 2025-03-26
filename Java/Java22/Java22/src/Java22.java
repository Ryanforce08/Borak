import java.util.Arrays;
import java.util.Random;

class Java22 {
    public static int findFactor (int n) 
	{
		if (n <= 1)
			return -1;

		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
				return i;
		}
		return -1;
	}
    public static void main(String[] args) {
        Random rand = new Random();
        int ran = rand.nextInt(49) + 2;  
        int[][] arr = new int[ran][];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = rand.nextInt(100) + 1;
        }
        System.out.print(Arrays.toString(arr));
    }
}