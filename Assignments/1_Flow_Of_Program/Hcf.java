import java.util.Scanner;
import java.util.ArrayList;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // HCF - highest Common Factor, GCD - Greatest Common Divisor
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                list1.add(i);
            }
        }
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                list2.add(i);
            }
        }
        int HCF = 1;
        int x = 0;

        while (x < list1.size()) {
            int y = 0;
            while (y < list2.size()) {
                if (list1.get(x) == list2.get(y)) {
                    HCF = Math.max(HCF, list1.get(x));
                }
                y++;
            }
            x++;
        }

        System.out.println("HCF or GCD of 2 numbers is " + HCF);
    }
}
