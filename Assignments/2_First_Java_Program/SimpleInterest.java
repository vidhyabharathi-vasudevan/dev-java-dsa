//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pricipal amount,time and interest one by one please");
        int P = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        System.out.println((P*t*r)/100);
    } 
}
