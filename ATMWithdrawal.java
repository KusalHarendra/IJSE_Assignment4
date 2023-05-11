import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int currentBalance = 10000; // Initializing balance of the customer
        int dailyLimit = 5000;      // Maximum amount that can be withdrawn in a day
        double chargeRate = 0.02;   // Charge rate if balance is less than 5000

        System.out.print("Enter your amout (Rs.) : ");
        int withdrawalAmount = input.nextInt();

        if(withdrawalAmount > currentBalance){              // Check if amount entered is greater than current balance
            System.out.println("Withdrawal refused. Amount entered is greater than current balance.");   
        }
        else if(withdrawalAmount > dailyLimit){         // Check if amount entered is greater than daily limit
            System.out.println("Withdrawal refused. Amount entered is greater than daily limit.");  
        }
        else if (currentBalance < 5000) {       // Check if balance is less than 5000 and apply charge
            double charge = withdrawalAmount * chargeRate;
            double amountWithCharge = withdrawalAmount + charge;
            if (amountWithCharge <= currentBalance) {
                currentBalance -= amountWithCharge;
                System.out.println("Withdrawal successful. " + charge + " rupees charged as fee.");
                System.out.println("Current balance: " + currentBalance + " rupees");
            } else {
                System.out.println("Withdrawal refused. Not enough balance to cover the withdrawal and fee.");
            }
        } 
        else {
            if (withdrawalAmount <= currentBalance) {       // If balance is 5000 or more, no charge is applied
                currentBalance -= withdrawalAmount;
                System.out.println("Withdrawal successful.");
                System.out.println("Current balance: " + currentBalance + " rupees");
            } else {
                System.out.println("Withdrawal refused. Not enough balance to cover the withdrawal.");
            }
    }
}
}
