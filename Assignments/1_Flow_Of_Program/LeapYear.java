
//Input a year and find whether it is a leap year or not.
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to identify as Leap or not");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println("The year you entered is a leap year");
        } else {
            System.out.println("The year you entered is not a leap year");
        }
    }
}