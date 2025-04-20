//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers please..");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The sum of 2 numbers you entered "+sum(a,b));
    }
    public static int sum(int a,int b){
        return a+b;
    }
}
