//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.	
import java.util.Scanner;
public class AreaAndCircumference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius to find the Area and Circumference of the circle");
        double radius = sc.nextDouble();
        System.out.println("Area: "+area(radius));
        System.out.println("Circumference "+circumference(radius));

    }
    public static double area(double radius){
        return 3.14*radius*radius;
    }
    public static double circumference(double radius){
        return 2*3.14*radius;
    }
    
}
