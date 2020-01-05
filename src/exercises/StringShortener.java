package exercises;

import java.util.Scanner;

public class StringShortener {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String text = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she " +
                "had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?'";
        String lowercaseText = text.toLowerCase();
        String searchTerm;
        String lowercaseSearchTerm;
        int indexOfWord;
        int lengthOfWord;
        String phraseBeforeCut;
        String phraseAfterCut;
        String newText;

        System.out.println("Enter your search term");
        searchTerm = input.nextLine();
        lowercaseSearchTerm = searchTerm.toLowerCase();

        indexOfWord = lowercaseText.indexOf(lowercaseSearchTerm);
        lengthOfWord = searchTerm.length();
        phraseBeforeCut = text.substring(0,indexOfWord);
        phraseAfterCut = text.substring(indexOfWord + lengthOfWord);
        newText = phraseBeforeCut + phraseAfterCut;

        System.out.println("index: " + indexOfWord);
        System.out.println("length: " + lengthOfWord);
        System.out.println("New phrase:");
        System.out.println(newText);


    }
}
