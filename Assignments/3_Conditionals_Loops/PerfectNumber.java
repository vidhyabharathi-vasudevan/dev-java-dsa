//Perfect Number In Java
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether the number is perfect or not");
        int n = sc.nextInt();
        int fact = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                fact = fact+i;
            }
        }
        if(fact == n){
            System.out.println("Yes the number you entered is a perfect number.");
        }else{
            System.out.println("No the number is not a perfect number");
        }
    }
    
}
