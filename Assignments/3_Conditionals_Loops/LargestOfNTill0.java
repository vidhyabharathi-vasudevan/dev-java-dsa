//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;
public class LargestOfNTill0 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Start Entering the numbers");
        int largest = 0;
        while(true){
            int n = sc.nextInt();
            if(n==0){
                break;
            }
            if(n>largest){
                largest = n;
            }

        }
        System.out.println("The Largest number among all the numbers you entered is "+largest);
    }
}
