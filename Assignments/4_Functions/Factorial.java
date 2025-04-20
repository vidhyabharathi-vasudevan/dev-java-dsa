/*
 * Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24 	
3! = 3 * 2 * 1 = 6 	
2! = 2 * 1 = 2 	
Also, 	
1! = 1 	
0! = 1	
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number please..");
        int n = sc.nextInt();
        System.out.println("The factorial of the number you entered is.."+fact(n));
    }
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        int fact = 1;
        for(int i=2;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
    
}
