package org.launchcode;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class Area {
    public static void main(String[] args) {
        double radius = validateInput();
        Scanner input = new Scanner(System.in);

        double area = Circle.getArea(radius);

        System.out.println("The area of a circle of your radius " + radius + " is: " + area);

    }

    public static double validateInput() {
        Scanner input = new Scanner(System.in);
        double radius = 0.0000;

        try {
            System.out.println("Enter a radius: " );
            radius = input.nextDouble();
            input.close();
            while (radius < 0) {
                System.out.println("Enter a valid number!");
                radius = validateInput();
            }
        } catch (InputMismatchException e){
            validateInput();
        }
        return radius;
    }

}
