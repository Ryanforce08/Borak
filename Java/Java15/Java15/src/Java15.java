import java.util.*;
public class Java15 {

	public static void main(String[] args) {
		Random r = new Random();
		double sum = 0;
		int i = 0;
		
		
		for (int num = 0; num < 1000; num++) {
			sum += (r.nextInt(1999 - 1000 + 1 ) + 1000) * 1.0 ;
			i++;			
		}
		System.out.print( sum / i );
		
	}
}
