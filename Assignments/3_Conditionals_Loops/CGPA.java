//Calculate CGPA Java Program
import java.util.Scanner;
public class CGPA {
    public static void main(String[] args){
        System.out.println("Enter the number of subjects");
        Scanner sc = new Scanner(System.in);
        int noOfSubs = sc.nextInt();
        double totalGradePoints = 0;
        int totalCreditPoints = 0;
        for(int i=0;i<noOfSubs;i++){
            System.out.println("Enter the details of the subject "+i+":");
            System.out.println("Grade Point: ");
            double gradePoint = sc.nextDouble();
            System.out.println("Enter the credit points: ");
            int creditPoints = sc.nextInt();
            totalGradePoints +=( gradePoint * creditPoints);
            totalGradePoints += creditPoints;
        }
        double cgpa = totalGradePoints / totalCreditPoints;
        System.out.println("Your CGPA is "+cgpa);
    }
}
