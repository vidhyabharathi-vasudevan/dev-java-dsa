//Sum Of N Numbers
import java.util.Scanner;
public class SumOfNNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println("Start Entering the numbers");
        int sum = 0;
        for(int i=0;i<n;i++){
            int in = sc.nextInt();
            sum = sum + in;
        }
        System.out.println("The sum of n numbers "+sum);
    }
}
