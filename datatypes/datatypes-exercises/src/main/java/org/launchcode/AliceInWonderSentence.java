package org.launchcode;
import java.util.Scanner;

public class AliceInWonderSentence {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it " +
                "had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without " +
                "pictures or conversation?";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your keyword to search: ");
        String keyword = input.next().toLowerCase();
        Integer index = sentence.toLowerCase().indexOf(keyword);
        Integer length = keyword.length();
        if (sentence.contains(keyword)) {
            System.out.println(true);
            System.out.println("Your search term first appears at index " + index + " and its length is " + length);
            String modifiedSentence = sentence.replace(keyword, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println(false);
        }
        input.close();

    }
}
