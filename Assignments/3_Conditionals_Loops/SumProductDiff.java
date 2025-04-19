//Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;
public class SumProductDiff{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;
        int diff = 0;
        while(n>0){
            int last = n%10;
            sum = sum + last;
            prod = prod*last;
            n = n/10;
        }
        diff = Math.abs(sum-prod);
        System.out.println("The diference of Sum and Product of the numbmer is "+diff);
    }
}