package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area;
        double radius = -1;



        do {
            System.out.println("Enter a positive radius:");
            while (!input.hasNextDouble()) {
                System.out.println("Invalid input!");
                input.next();
            }
                radius = input.nextDouble();
        } while (radius < 0);

        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
        return;



    }
}
