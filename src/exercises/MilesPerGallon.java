package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        double miles;
        double gallons;
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        miles = input.nextDouble();
        System.out.println("How many gallons you used?");
        gallons = input.nextDouble();

        System.out.println("Miles per gallon for you trip:" + ( miles/gallons ));
    }
}
