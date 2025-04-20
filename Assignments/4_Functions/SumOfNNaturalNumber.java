//Write a function that returns the sum of first n natural numbers.	
import java.util.Scanner;
public class SumOfNNaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n pleasee");
        int n = sc.nextInt();
        System.out.println("The sum of "+n+" natural numbers is "+sum(n));
    }
    public static int sum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        return sum;
    }
    
}
