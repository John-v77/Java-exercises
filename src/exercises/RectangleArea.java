package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        double length;
        double width;
        Scanner input = new Scanner(System.in);
        System.out.println("Type rectangle's length");
        length = input.nextDouble();
        System.out.println("Type rectangle's width");
        width = input.nextDouble();

        System.out.println("Rectangle's area is: " + (width*length));

    }
}
