import java.util.*;

public class MaxNumber {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter your second number : ");
        int num2 = input.nextInt();

        System.out.print("Enter your third number : ");
        int num3 = input.nextInt();     //three inputs

        int maxNum = num1;

        if(num2 > maxNum){
            maxNum = num2;
        }
        if(num3 > maxNum){
            maxNum = num3;
        }
        System.out.println("The maximum number is: " + maxNum);
    }
}