package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);
        cones.sort(new ConeComparator());

        System.out.println("Flavors:");
        for (Flavor flavor: flavors
             ) {
            System.out.println(flavor.getName());
        }

        System.out.println("\nCones:");
        for (Cone cone: cones
             ) {
            System.out.println(cone.getName() + ": " + cone.getCost());
        }
    }
}
