import java.util.Scanner;

class GreaterNumber{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter your second number : ");
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("Sum of two numbers = " + (num1 + num2));
        }
        else{
            System.out.println("Your numbers are " + num1 + " & " + num2 );
        }
    }
}