
public class Java10 {

	public static void main(String[] args) {
		double num;
		for(int i = 0; i < 10; ++i) {
			num = Math.sqrt(i);
			System.out.print(i + ": ");
			System.out.println(Math.round(num));
		}

	}

}
