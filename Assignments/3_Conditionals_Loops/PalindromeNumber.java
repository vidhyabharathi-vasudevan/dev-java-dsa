// Find if a number is palindrome or not
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        System.out.println("Enter the number please..");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int rev = 0;
        while(n>0){
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        if(rev == x){
            System.out.println("Yes the number you entered is a palindrome number...");
        }else{
            System.out.println("No, the number you entered is not a palindrome number..");
        }
    }
    
}
