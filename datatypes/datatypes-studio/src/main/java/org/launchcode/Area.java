package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 0;

        do {
            System.out.println("Enter the radius :");
            try {
                radius = input.nextDouble();
                if (radius < 0 || String.valueOf(radius).isEmpty()) {
                    System.out.println("You have entered invalid input");
                } else {
                    double area = Circle.getArea(radius);
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                }
            } catch (Exception e) {
                System.out.println("You have entered invalid input.");
                return;
            }
        } while (radius < 0);

    }
}
