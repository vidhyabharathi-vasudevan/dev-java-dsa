// To find Armstrong Number between two given number.
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            boolean y = isArmstrong(i);
            if(y){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isArmstrong(int n){
        String s = n+"";
        int count = s.length();
        int arm = 0;
        int x = n;

        while(n>0){
            int last = n % 10;
            arm = arm + (int)Math.pow(last,count);
            n = n / 10;
        }
        if(arm == x){
            return true;
        }
        return false;
    }
    
}
