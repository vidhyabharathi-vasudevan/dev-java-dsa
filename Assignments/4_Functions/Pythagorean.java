
// Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triplet one by one");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("Yes this is a Pythagorean triplet");
        }else{
            System.out.println("No, this is not a pythagorean triplet");
        }

    }

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return true;
        } else {
            return false;
        }
    }
}