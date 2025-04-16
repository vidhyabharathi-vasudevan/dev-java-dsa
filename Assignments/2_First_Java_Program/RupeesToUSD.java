//Input currency in rupees and output in USD.
import java.util.Scanner;
public class RupeesToUSD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency in rupees");
        int r = sc.nextInt();
        System.out.println((r/85)+"$");
    }
}
