// Calculate Discount Of Product
import java.util.Scanner;
public class DiscountOfTheProduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price");
        int price = sc.nextInt();
        System.out.println("Enter the discount amount");
        int discount = sc.nextInt();
        float priceAfterDiscount = ((float)(discount/100f));
        System.out.println("Discount amount "+(priceAfterDiscount*price));
        System.out.println("Actual Price after Discount "+(price-(priceAfterDiscount*price)));
    
    }
}
