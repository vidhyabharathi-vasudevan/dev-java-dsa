// Define a program to find out whether a given number is even or odd.	
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number please..");
        int n = sc.nextInt();
        System.out.println("The number you entered is an "+oddOrEven(n)+" number");

    }
    public static String oddOrEven(int n){
        if(n%2==0){
            return "Even";
        }
        return "Odd";
    }
}
