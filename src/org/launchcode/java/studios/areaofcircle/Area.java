package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double pi = 3.14;
        double radius = 0;
        double answer;
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println("What is the area of circle? :");
            radius = userInput.nextDouble();
        } while(radius != 0);
//      calculate area
        answer = Circle.getArea(radius);

        System.out.println("The area of circle of radius " + radius + " is: " + answer);
    }
}
