package exercises;

import java.util.Arrays;

public class GreenEggsAndHam {
    public static void main (String[] args) {
        String text = "I would not, could not, in a box. I would not, could not " +
                "with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] textWords = text.split(" ");
        System.out.println(Arrays.toString(textWords));
        String[] textSentences = text.split("\\.");
        System.out.println(Arrays.toString(textSentences));
    }
}
