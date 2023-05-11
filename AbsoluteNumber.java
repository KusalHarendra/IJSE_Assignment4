import java.util.Scanner;

class AbsoluteNumber{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        int num1 = input.nextInt();

        if (num1 >= 0){
            System.out.println("Absolute number of = " + num1 + " is " + num1);
        }
        else{
            int num2 = -(num1);
            System.out.println("Absolute number of = " + num1 + " is " + num2);   
        }
    }
}