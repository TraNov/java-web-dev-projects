package org.launchcode;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class LoopString {
    //class variables
    //constructors
    public LoopString() {
    }

    //methods
    public void countCharacters(String wordsToCount) {

         // Bonus Mission 2: Make the character counts case-insensitive (lower-case).
         wordsToCount = wordsToCount.toLowerCase();

        char[] charsArray = wordsToCount.toCharArray();		// Convert string to array of Chars
        HashMap<Character, Integer> hashCharacterCount = new HashMap<>();
        // Loop thru array of chars
        for (int i = 0; i < charsArray.length; i++) {

            // ignore non-alphabetical characters using Character method
            // Bonus Mission 3: Exclude non-alphabetic characters.
            if (Character.isLetter(charsArray[i]) == false) {
                continue;
            }
            // add or updated the count of each character into the HashMap (hashCharacterCount)
            char charFocus = charsArray[i];
            if (hashCharacterCount.containsKey(charFocus) == false) {
                // Add: char does not exists (does not contain the key)
                //      initialize with value of 1.
                hashCharacterCount.put(charFocus, 1);
            } else {
                // Update: char does exists (does contain the key)
                Integer valueCharacterCount = hashCharacterCount.get(charFocus);
                valueCharacterCount = valueCharacterCount + 1;
                hashCharacterCount.put(charFocus, valueCharacterCount);		// Update value in hash Character Count
            }
        }
        // Loop thru hashCharacterCount and display counts
        ArrayList<Character> listCharacterKeys = new ArrayList<>(hashCharacterCount.keySet());
        for (int i = 0; i < listCharacterKeys.size(); i++) {
            Integer valueCharacterCount = hashCharacterCount.get(listCharacterKeys.get(i));
            System.out.println(listCharacterKeys.get(i) + ": " + valueCharacterCount);
        }
    }

    public String getUserInput() {
        // Bonus Mission 1: Prompt the user to enter the string in the command line.
        Scanner scannerInput = new Scanner(System.in);

        String userInput = scannerInput.nextLine();

        scannerInput.close();

        return userInput;
    }

    public String getTextFromFile(String pathToTheFile) {
        // Super Bonus Mission: Read the string in from a file.
        String textFileInput = "";
        try {
            // Using readAllBytes to pull in text file
            textFileInput = new String(Files.readAllBytes(Paths.get(pathToTheFile)));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return textFileInput;
    }
}