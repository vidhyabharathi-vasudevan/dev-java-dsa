
// To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 2; i <= n; i++) {
            int temp = a;
            a = b;
            b = a + temp;
            System.out.print(b + " ");
        }
    }

}
