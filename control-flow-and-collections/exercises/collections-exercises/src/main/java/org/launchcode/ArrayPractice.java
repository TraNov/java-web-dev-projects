package org.launchcode;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayPractice {
    public static void main(String[] args) {
        //
        // Array Practice 1
        //
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(integerArray[i] );
            if(integerArray[i] % 2 == 0)
                System.out.println(integerArray[i] + " is even");
            else
                System.out.println(integerArray[i] + " is odd");

        }
        //
        // Array Practice 3
        //
        System.out.println("*******");
        System.out.println("******* Array Practice 3");
        System.out.println("*******");
        //
        //
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split("\\.");
        //
        //
        System.out.println(Arrays.toString(words));
        //
        //
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(6);
        ints.add(8);
        ints.add(9);
        ints.add(11);
        ints.add(12);
    }
}
