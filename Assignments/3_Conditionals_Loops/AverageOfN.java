// Calculate Average Of N Numbers
import java.util.Scanner;
public class AverageOfN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a+b+c)/3);
    } 
}
