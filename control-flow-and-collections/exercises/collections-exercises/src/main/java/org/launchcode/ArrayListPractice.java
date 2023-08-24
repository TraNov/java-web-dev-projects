package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("*******");
         System.out.println("******* ArrayList Practice 1");
         System.out.println("*******");

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(6);
        ints.add(8);
        ints.add(9);
        ints.add(11);
        ints.add(12);
        int intsum = sumEven(ints);
        System.out.println(intsum + " intSum");
        //
         System.out.println("*******");
         System.out.println("******* ArrayList Practice 3");
         System.out.println("*******");
         //
         System.out.println("Enter a word length: ");
         int numChars = input.nextInt();
        //
         input.close();
        //
        //

    }
    }
