
//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class Greatings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name please...");
        String s = sc.next();
        System.out.println("Hellow "+s+" Good Day :)");  
    }
}
