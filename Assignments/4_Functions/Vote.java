//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.	
import java.util.Scanner;
public class Vote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age please");
        int age = sc.nextInt();
        if(isEligibleToVote(age)){
            System.out.println("Yes you are eligible to vote");
        }else{
            System.out.println("No, since you are under 18, you are not eligible to vote");
        }

    }
    public static boolean isEligibleToVote(int age){
        if(age<18){
            return false;
        }
        return true;

    }
    
}
