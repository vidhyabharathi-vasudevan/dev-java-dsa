// Write a function that returns all prime numbers between two given numbers.	
import java.util.Scanner;
public class AllPrimesBetweenTheRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start range");
        int start = sc.nextInt();
        System.out.println("Enter the end range");
        int end = sc.nextInt();
        System.out.println("The prime numbers between the range are..");
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
    public static boolean isPrime(int x){
        boolean flag = true;
        if(x<=2){
            return flag;
        }
        for(int i=2;i<x;i++){
            if(x%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}