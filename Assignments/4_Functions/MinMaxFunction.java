//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;
public class MinMaxFunction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number please..");
        int a = sc.nextInt();
        System.out.println("Enter the second number please..");
        int b = sc.nextInt();
        System.out.println("The minimum of 2 numbers from you entered is.."+min(a,b));
        System.out.println("The maximum of 2 numbers from you entered is.."+max(a,b));

    }
    public static int min(int x,int y){
        if(x<y){
            return x;
        }
        return y;
    }
    public static int max(int x,int y){
        if(x>y){
            return x;
        }
        return y;
    }

}