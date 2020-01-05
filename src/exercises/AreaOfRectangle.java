package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle in feet:");
        float length = input.nextFloat();
        System.out.println("What is the width of your rectangle in feet:");
        float width = input.nextFloat();
        input.close();
        float area = length * width;

        System.out.println("The area of your rectangle is: " + area + " square feet.");
    }
}
