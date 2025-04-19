// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;
public class InputTill0AndSum {
    public static void main(String[] args){
        System.out.println("Start entering the numbers...");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            sum = sum + n;
        }
        System.out.println("The sum of numbers you entered till now "+sum);
    }
}
