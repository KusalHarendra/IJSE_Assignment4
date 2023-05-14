import java.util.*;

public class OddEven {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = input.nextInt();      //input an integer

        if((num % 2)  ==  0 ){
            System.out.println(num +" is an even number");
        }
        if((num % 2) == 1){
            System.out.println(num  + " is an odd number");
        }
        
    }
}