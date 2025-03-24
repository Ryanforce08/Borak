
public class Java20 {
	public static long fibonacci(int n)
	{
	   if (n<=1)
	      return n;
	   else
	      return fibonacci(n-1) + fibonacci(n - 2);
	}
	public static long factorial (int n)
	{
	   if (n == 0 || n == 1)
	      return 1;
	   else
	      return n * factorial (n - 1);
	}
	public static long power(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * power(x, y - 1);
    }
	public static void main(String[] args) {
		System.out.print("fibonacci: [ ");
		
		for (int i = 0; i < 15 ;i++)
			System.out.print(fibonacci(i) + " ");
		System.out.println("]");
		
		System.out.println("fibonacci 21: " + fibonacci(21));
		
		System.out.print("factorial: [ ");
		for (int i = 0; i < 10 ;i++)
			System.out.print(factorial(i) + " ");
		System.out.println("]");
		
		for (int i = 0; i < 10; i++) {
			for ( int j = 0; j < 10; j++) {
				System.out.print(i + "^" + j + " = " + power(i,j) + ",\t");
			}
			System.out.println("");
			
		}
		
	}

}
