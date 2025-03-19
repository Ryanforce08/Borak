
public class Java15a {
	public static void main( String[] args ) { 
		double sum = 0;
		int i = 0;
		
		
		for (int num = 0; num < 1000; num++) {
			sum += (int) (Math.random() * (2000 - 1000 + 1 ) + 1000) * 1.0;
			i++;			
		}
		System.out.print( sum / i );
	}
}
