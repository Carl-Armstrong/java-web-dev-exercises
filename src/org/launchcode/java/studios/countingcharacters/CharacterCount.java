package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CharacterCount {
    public static void main (String[] args) {
        int userChoice;
        String quote = ""; // initialized to prevent the 'may not be initialized' error
        char[] quoteCharArray;
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the text you want to count:");
        quote = input.nextLine();

        // Display the quote that will be counted
        System.out.println("\nHere is the quote that will be counted:");
        System.out.println(quote);

        // remove non alpha characters and make lowercase
        quoteCharArray = RemoveNonAlpha.removeNonAlpha(quote).toLowerCase().toCharArray();


        HashMap<String, Integer> charactersInString = new HashMap<>();

        // put each char into the hashmap and set the value to 0
        // This way they each exist to be incremented in the next step
        for (char uniqueChar: quoteCharArray
             ) {
            if (!charactersInString.containsKey(uniqueChar)) {
                charactersInString.put(Character.toString(uniqueChar), 0);
            }
        }

        // check each character from the quote and increment by one each time they are found
        for (char charInstance: quoteCharArray
             ) {
            charactersInString.put(Character.toString(charInstance), charactersInString.get(Character.toString(charInstance)) +1);
        }

        // print out the counts
        for (Map.Entry<String, Integer> mapChar: charactersInString.entrySet()) {
            System.out.println(mapChar.getKey() + " (" + mapChar.getValue() + ")");
        }

    }
}
