// Define a method to find out if a number is prime or not.	
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number please..");
        int x = sc.nextInt();
        if(isPrime(x)){
            System.out.println("The number you entered is a prime number");
        }else{
            System.out.println("The number you entered is not a prime number");
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
