import java.util.Scanner;

public class Marks {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Marks of Chemistry : ");
        int marksChem = input.nextInt();

        System.out.print("Marks of Physics : ");
        int marksPhysics = input.nextInt();

        System.out.print("Marks of Com.Maths : ");
        int marksComMaths = input.nextInt();

        int total = marksChem + marksPhysics + marksComMaths;
        float average = total/3;

        if (average > 75){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");   
        }
    }
    
}
