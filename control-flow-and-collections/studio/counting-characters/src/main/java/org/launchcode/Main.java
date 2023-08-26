package org.launchcode;

public class Main {

    public static void main(String[] args){
        LoopString countCharacter = new LoopString();
        System.out.println("*******");
        System.out.println("******* Get User Input");
        System.out.println("*******");

        String usersInput = countCharacter.getUserInput();      // Get userIInput
        // Get the input txt file. One line of text (sample.txt).
        // Create src/main/resources Directory and Mark Directory for fileInput
        //
        String fileInput = countCharacter.getTextFromFile("C:\\LaunchCode\\Unit2\\Chapt3\\sample.txt");
        fileInput = countCharacter.getTextFromFile( "src/main/resources/sample.txt");
        countCharacter.countCharacters(usersInput);
        System.out.println("*******");
        System.out.println("******* Input Sample.txt");
        System.out.println("*******");
        countCharacter.countCharacters(fileInput);
    }
}
