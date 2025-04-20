// Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers please..");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The product of 2 numbers that you entered is "+product(a, b));

    }
    public static int product(int a,int b){
        return a*b;
    }
}
