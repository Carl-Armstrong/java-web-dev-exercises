package org.launchcode.java.studios.countingcharacters;

public class RemoveNonAlpha {
    public static String removeNonAlpha(String inputString) {
        String outputString = "";

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isLetter(inputString.charAt(i))) {
                outputString += inputString.charAt(i);
            }
        }

        return outputString;
    }
}
