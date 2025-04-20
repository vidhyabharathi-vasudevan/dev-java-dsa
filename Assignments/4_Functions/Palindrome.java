//Write a function to find if a number is a palindrome or not. Take number as parameter.	
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number..");
        int x = sc.nextInt();
        if(isPalindrome(x)){
            System.out.println("The number you entered is a palindrome number..");
        }else{
            System.out.println("The number you entered is not a palindrome number");
        }

    }
    public static boolean isPalindrome(int n){
        int x = n;
        int rev = 0;
        while(n>0){
            int last = n%10;
            rev = rev*10+last;
            n = n / 10;
        }
        if(rev == x){
            return true;
        }
        return false;
    }
    
}
