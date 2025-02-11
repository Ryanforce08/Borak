package test;
import java.util.*;


public class Test {

	/*public static void XwithXs(String[] args) {
		System.out.println("X       X");
		System.out.println(" X     X");
		System.out.println("  X   X");
		System.out.println("   X X");
		System.out.println("    X ");
		System.out.println("   X X");
		System.out.println("  X   X");
		System.out.println(" X     X");
		System.out.println("X       X");
	}
	*/
	/*
	public static void main( String[] args )
	{
		System.out.println( "Abbie Zuckerman\t23yrs\tSoccer" );
		System.out.println( "Brittany Ying\t21yrs\tSwimming" );
		System.out.println( "Caty Xenakis\t22yrs\tSoftball" );
		System.out.println( "Dee Wick\t20yrs\tBasketball" );
		System.out.println( "Eva Venera\t19yrs\tPolo" );
	}
	*/
	/*
	public static void main ( String[] args ) {
		float litFloat = 120.5F;
	}
	*/
	/*
	public static void main( String[] args ) {
		int x, y, z, w;
		x = -11;
		 y = 4;
		 z = x / ++y;
		 w = ++x % y--;

		System.out.println( " x " + x + " y " + y + " z " + z + " w " + w );
	}*/
	public static void main( String[] args )
	 {
	 Scanner keyboard = new Scanner( System.in );
	 String word1 , word2;
	 double real;
	 int value;
	 System.out.print( "Enter a real number (for a double): " );
	 real = keyboard.nextDouble();
	 System.out.print( "Enter a word: " );
	 word1 = keyboard.nextLine();
	 System.out.print( "Enter an integer (for an int): " );
	 value = keyboard.nextInt();
	 System.out.print( "Enter another word: " );
	 word2 = keyboard.nextLine();
	 System.out.print( "Your have entered: " );
	 System.out.println(
	 real + ", " + word1+ ", " + value + ", " + word2 );
	 }
	}

