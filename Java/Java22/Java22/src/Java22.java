import java.util.Arrays;
import java.util.Random;

class Java22 {
    public static int findFactor (int n) {
		if (n <= 1)
			return n;

		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
				return i;
		}
		return n;
	}
    public static int[][] convertTo2D(int[] array) {
        int length = array.length;
        int factor = findFactor(length);
        
        int cols = length;
        int[][] array2D = new int[cols][cols];
        
        for (int i = 0; i < cols; i++) {
            array2D[i][i] = array[i];
        }
        
        return array2D;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int ran = rand.nextInt(50) + 1;  
        int[] arr = new int[ran];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }
        int[][] arr2d = convertTo2D(arr);
        
        System.out.print("1D Array:");
        System.out.println(Arrays.toString(arr));

        System.out.print("2D Array: [");
        for (int i = 0; i < arr2d.length - 1; i++) {
            System.out.print("[");
            for (int j = 0; j < arr2d[0].length - 1; j++){
                System.out.print(", " + arr2d[i][j]);
            }
            System.out.print("], ");
        }
        System.out.print("]");
    }
}