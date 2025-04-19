//Power In Java
import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double pow = Math.pow(a,b);
        System.out.println(pow);
    }
}
