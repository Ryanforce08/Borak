import java.util.Scanner;

public class Java14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double sum = 0.0;
        int totalCredits = 0;
        int credits = 0;
        double numGrade = 0.0;
        String grade = "";
        
        
        System.out.print("Please enter the number of classes: ");
        int numClasses = s.nextInt();
        
        for (int i = 1; i <= numClasses; i++) {
            System.out.println("Course " + i);
            
            System.out.print("How many credits? ");
            credits = s.nextInt();
            
            System.out.print("Grade received: ");
            grade = s.next().toUpperCase(); 
            
            numGrade = 0.0;      
            
            if (grade.equals("A")) {
                numGrade = 4.0;
            } else if (grade.equals("B")) {
                numGrade = 3.0;
            } else if (grade.equals("C")) {
                numGrade = 2.0;
            } else if (grade.equals("D")) {
                numGrade = 1.0;
            } else {
                numGrade = 0.0;
            } 
            
            sum += credits * numGrade;
            totalCredits += credits;
        }
        s.close();
        
        double gpa = sum / totalCredits;
        System.out.println("Your GPA is: " + gpa);
        
       
    }
}
