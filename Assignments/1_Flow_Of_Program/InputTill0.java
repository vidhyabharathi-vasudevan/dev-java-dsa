//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;
public class InputTill0 {
    public static void main(String[] args){
        System.out.println("Start entering inputs and press 0 for termination..");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
        int a = sc.nextInt();
        if(a==0){
            break;
        }
        sum = sum + a;
        }
        System.out.println("Sum: "+sum);
    }
    
}
