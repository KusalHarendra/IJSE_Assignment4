import java.util.*;

public class AreaOf_a_Circle {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float radius = input.nextFloat();

        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle = " + area + " Sqr Unit");
    }
}