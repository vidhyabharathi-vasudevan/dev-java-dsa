//Sum of a Digit of a number
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number please");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int last = n % 10;
            sum = sum + last;
            n = n / 10;
        }
        System.out.println("The sum of digits of the number you entered is "+sum);
    }
}
