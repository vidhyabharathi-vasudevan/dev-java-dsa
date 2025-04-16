//To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string please..");
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb+"")){
            System.out.println("Yes the string you entered is a palindrome string");
        }else{
            System.out.println("No, it is not a palindrome string..");
        }

        //Without using stringbuilder

        char[] c = s.toCharArray();
        String rev = "";
        for(int i=c.length-1;i>=0;i--){
            rev = rev + c[i];
        }
        if(s.equals(rev)){
            System.out.println("Yes the string you entered is a palindrome string");
        }else{
            System.out.println("No, it is not a palindrome string..");
        }
        

    }
    
}
