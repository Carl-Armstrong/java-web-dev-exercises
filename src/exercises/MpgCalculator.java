package exercises;

import java.util.Scanner;

public class MpgCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        float miles;
        float gallons;
        float mpg;

        System.out.println("How many miles have you driven:");
        miles = input.nextFloat();
        System.out.println("How many gallons of gas have you used:");
        gallons = input.nextFloat();

        mpg = miles / gallons;

        System.out.println(mpg + " miles per gallon");
    }
}
