import java.util.Scanner;

public class Discount {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Unit price : ");
        float unitPrice = input.nextFloat();

        System.out.print("Amount : ");
        int amount = input.nextInt();

        double total = amount * unitPrice;

        if (total > 500){
            double newtotal = total - (total * 0.05); 
            System.out.println("New total = Rs." + newtotal);
        }
        else{
            System.out.println("No discount given");   
        }
    }
}
