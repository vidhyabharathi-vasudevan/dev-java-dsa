//Reverse A String in Java
import java.util.Scanner;
public class ReverseAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string please...");
        String s = sc.next();
        char[] c = s.toCharArray();
        String r = "";
        for(int i=c.length-1;i>=0;i--){
            r = r+c[i];
        }
        System.out.println("Reversed String is "+r);
    }
}
