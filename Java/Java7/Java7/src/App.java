import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int age;
        int num;
        int year;

        Scanner s = new Scanner(System.in);
        age = s.nextInt();
        num = s.nextInt();
        year = s.nextInt();

        if (age < 18){
            System.out.println("You are young");
        }
        if (num < 100){
            System.out.println("Cool Number");
        }
        else {
            System.out.println("Way cool number");
        }
        if (year == 2028){
            System.out.println("Freshman");
        }
        else if (year == 2027){
            System.out.println("Sophomore");
        }
        else if (year == 2026){
            System.out.println("Junior");
        }
        else if (year == 2025){
            System.out.println("Senior");
        }
        else {
            System.out.println("You are not in high school");
        }
        s.close();
    }
}
