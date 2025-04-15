import java.util.Scanner;
public class SumOfBoth {
    public static void main(String[] args)
    {
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("The sum of both of the numbers you entered "+(a+b));

    }
}
