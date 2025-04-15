import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        System.out.println("Enter the table you want");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=16;i++){
            System.out.println(i+" * "+n+" = "+(n*i));
        }
    }
}
