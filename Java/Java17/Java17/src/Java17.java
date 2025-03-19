
public class Java17 {

	public static void main(String[] args) {
		int[][] arr = new int[9][9];
		
		for (int i = 0; i < arr.length; i++) {
			for ( int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i * j;
				
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
		   for (int j = 0; j < arr[i].length; j++)
		   {
		      System.out.print(i + "x" + j + "=" + arr[i][j] + "\t");  
		   }
		   System.out.println();
		}

	}

}
