
//Java Program Vowel Or Consonant
import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        System.out.println("Enter the character please..");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
            System.out.println("The character you entered is a vowel.");
        }else{
            System.out.println("The number you entered is a consonent");
        }

    }

}
