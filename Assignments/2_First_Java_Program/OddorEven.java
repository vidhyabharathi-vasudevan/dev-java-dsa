//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;
public class OddorEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number pleaseeeeee...");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("The number you entered is an even number..");
        }else{
            System.out.println("The number you entered is an odd number..");
        }
    }
}