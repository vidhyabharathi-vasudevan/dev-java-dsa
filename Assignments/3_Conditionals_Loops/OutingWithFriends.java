
//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
import java.util.Scanner;

public class OutingWithFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month please..");
        String month = sc.next();
        int evenDays = 0;
        switch (month) {
            case "February":
                evenDays = 14;
                break;
            default:
                evenDays = 15;
                break;
        }
        System.out.println("The number of evenDays that kunal can go out with his friends for the month you entered is "+evenDays);
    }

}
