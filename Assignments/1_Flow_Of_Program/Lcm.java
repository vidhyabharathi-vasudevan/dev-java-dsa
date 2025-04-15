import java.util.ArrayList;
import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int hcf = hcf(a,b);
        int lcm = (a*b)/hcf;
        System.out.println("Lcm of 2 numbers is "+lcm);

    }

    public static int hcf(int a, int b) {
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
        return HCF;
    }
}
