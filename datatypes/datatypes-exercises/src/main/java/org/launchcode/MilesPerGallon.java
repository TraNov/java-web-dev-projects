package org.launchcode;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many miles have you driven? ");
        Double miles = input.nextDouble();
        System.out.print("How many gallons of gas have you gone through? ");
        Double gallons = input.nextDouble();
        Double mpg = miles/gallons;
        System.out.println("Your MPG is: " + mpg);
        input.close();
    }
}
