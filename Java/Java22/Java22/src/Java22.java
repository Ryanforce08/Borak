import java.util.Arrays;
import java.util.Random;

public class Java22 {

    public static void main(String[] args) {
        Random rand = new Random();
        int ran = rand.nextInt(49) + 2;

        int[] arr = new int[ran];
        for (int i = 0; i < ran; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }

        int[][] result = convertTo2DArray(arr, ran);

        System.out.println("length: " + arr.length);
        System.out.println("1D Array: " + Arrays.toString(arr));

        System.out.print("2D Array: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(Arrays.toString(result[i]));
        }
        System.out.println("]");
    }

    public static int[][] convertTo2DArray(int[] arr, int ran) {
        int factor = findFactor(ran);
        int rows = 1;
        int cols = ran;

        if (factor > 1 && factor < ran) {
            rows = factor;
            cols = ran / factor;
        }

        int[][] result = new int[rows][cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (index < arr.length) {
                    result[i][j] = arr[index];
                    index++;
                }
            }
        }

        return result;
    }

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
}
