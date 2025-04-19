import java.util.Scanner;
public class SumOfPositivesAndNegatives {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Yeah you can start entering the numbers...");
        int sumOfNegatives = 0;
        int sumOfEvenPositives = 0;
        int sumOfOddPositives = 0;
        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            if(n<0){
                sumOfNegatives = sumOfNegatives + n;
            }else if(n>0 && n%2==0){
                sumOfEvenPositives = sumOfEvenPositives + n;
            }
            else{
                sumOfOddPositives = sumOfOddPositives + n;
            }
        }
        System.out.println("Sum of Negative numbers "+sumOfNegatives);
        System.out.println("Sum of Even Positives "+sumOfEvenPositives);
        System.out.println("Sum of Odd Positives "+sumOfOddPositives);
        
    }
    
}
