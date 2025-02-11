
public class Java6 {

	public static void main(String[] args) {
		String s1 = " hello world ";
		String s2 = "l";
		String s3 = "W";
		int i1 = 4;
		int i2 = 7;
		
		//removes spaces if front and back of string
		//returns String
		System.out.println(s1.trim());
		
		//Sets all chars to uppercase
		//Returns string
		System.out.println(s1.toUpperCase());
		
		//sets all chars to lowercase
		//returns string
		System.out.println(s1.toLowerCase());
		
		//returns the char at i1
		//returns char
		System.out.println(s1.charAt(i1));
		
		//returns the  first posision of substring s2 in string s1 
		//returns int
		System.out.println(s1.indexOf(s2));
		
		//Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
		//returns int
		System.out.println(s1.indexOf(s2, i1));
		
		//replaces each accurence of substring s2 with s3 in string s1
		//returns string
		System.out.println(s1.replace(s2, s3));
		
		//returns the amount of chars in a string s1 
		//returns string
		System.out.println(s1.length());
		
		//compares string s1 to s2. if they are the same returns true if they are not it returns false
		//returns bool
		System.out.println(s1.equals(s2));
		
		//returns the substing of the string starting after i1
		//returns string
		System.out.println(s1.substring(i1));
		
		//returns the substring of the string in between i1 and i2
		//returns string
		System.out.println(s1.substring(i1, i2));
		
		//compares the stings lexicographically. returns negative int if it comes before and a positive if it comes after and if they are the same returns 0. 
		//returns int
		System.out.println(s3.compareTo(s3));

	}

}
