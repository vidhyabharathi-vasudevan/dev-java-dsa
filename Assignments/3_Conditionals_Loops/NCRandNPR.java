//Find Ncr & Npr
import java.util.Scanner;
public class NCRandNPR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter R");
        int r = sc.nextInt();
        int ncr = fact(n)/(fact(r)*fact(n-r));
        int npr = fact(n)/fact(n-r);
        System.out.println("Permutation: "+npr);
        System.out.println("Combination: "+ncr);

    }
    public static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
}
