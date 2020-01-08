package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class WordLengthFinder {
    public static void main (String[] args) {
        String text = "I would not, could not, in a box. I would not, could not " +
                "with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String textWithoutCommas = text.replace(",", "");
        String textWithoutPeriods = textWithoutCommas.replace(".", "");
        String textArray[] = textWithoutPeriods.split(" ");
        List<String> textList = new ArrayList<String>();
        textList = Arrays.asList(textArray);
        int wordLength;
        Scanner input = new Scanner(System.in);

        System.out.println("What length of word would you like to find:");
        wordLength = input.nextInt();

        for (String word: textList
             ) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }
    }
}
