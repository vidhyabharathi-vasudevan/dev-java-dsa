
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number..");
        int a = sc.nextInt();
        System.out.println("Enter the second number..");
        int b = sc.nextInt();
        System.out.println("Which operation you wanna perform now?.. + or - or * or /");
        String s = sc.next();
        char c = s.charAt(0);
        if (c == '+') {
            System.out.println("The adddition of 2 numbers is " + (a + b));
        } else if (c == '-') {
            System.out.println("The subtraction of 2 numbers is " + (a - b));
        } else if (c == '*') {
            System.out.println("The multiplication of 2 numbers is " + (a * b));
        } else if (c == '/') {
            System.out.println("The division of 2 numbers is " + (a / b));
        } else {
            System.out.println("Oops you entered a wrong character..");
        }

    }

}
