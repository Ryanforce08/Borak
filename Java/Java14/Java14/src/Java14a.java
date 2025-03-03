import java.util.Scanner;

public class Java14a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double sum = 0.0;
        int totalCredits = 0;

        System.out.print("Please enter the number of classes: ");
        int numClasses = s.nextInt();

        for (int i = 1; i <= numClasses; i++) {
            System.out.println("Course " + i);

            System.out.print("How many credits? ");
            int credits = s.nextInt();

            System.out.print("Grade received: ");
            String grade = s.next().toUpperCase();

            double numGrade = 0.0;
            
            if (grade.equals("A")) {
                numGrade = 4.0;
            } else if (grade.equals("B")) {
                numGrade = 3.0;
            } else if (grade.equals("C")) {
                numGrade = 2.0;
            } else if (grade.equals("D")) {
                numGrade = 1.0;
            } else if (grade.equals("F")) {
                numGrade = 0.0;
            } else {
                System.out.println("Invalid grade entered.");
                return;
            }
            
            sum += credits * numGrade;
            totalCredits += credits;
        }
        
        double gpa = sum / totalCredits;
        System.out.println("Your GPA is: " + gpa);
        
        if (gpa >= 3.0 && gpa <= 4.0) {
            System.out.println("Excellent Job");
        } else if (gpa >= 2.0 && gpa < 3.0) {
            System.out.println("Nice Job");
        } else if (gpa >= 1.0 && gpa < 2.0) {
            System.out.println("Satisfactory Job");
        } else if (gpa >= 0.0 && gpa < 1.0) {
            System.out.println("Failing Job");
        }
        
        s.close();
    }
}
