//Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number please");
        int a = sc.nextInt();
        System.out.println("Enter the second number please");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("First number is greated than the second number");
        }else if(b>a){
            System.out.println("Second number is greater than the first number");
        }else{
            System.out.println("They are equal..");
        }
    } 
}
