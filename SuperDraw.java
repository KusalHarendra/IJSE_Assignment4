import java.util.Scanner;

public class SuperDraw {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Unit price : ");
        float unitPrice = input.nextFloat();

        System.out.print("Amount : ");
        int amount = input.nextInt();

        float total = amount * unitPrice;

        if (total > 1500){
            System.out.println("You are entitled to the super draw");
        }
        else{
            System.out.println("try again");   
        }
    }
}
