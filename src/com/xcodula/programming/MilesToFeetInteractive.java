package com.xcodula.programming;

import java.util.Scanner;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Programming Exercise 4.b, page 113
 */
public class MilesToFeetInteractive {
    public static final int FEET_IN_MILE = 5280;

    protected double getDistanceInMiles() {
        double result = 0;
        try {
            Scanner inputDevice = new Scanner(System.in);
            System.out.print("Please enter a distance in miles >> ");
            // I wonder if I should read in as string an try/parse
            result = inputDevice.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public void displayDistance() {
        double distanceInMiles = getDistanceInMiles();
        double distanceInFeet = distanceInMiles * FEET_IN_MILE;
        System.out.printf("The distance to my uncle's house is %.2f miles or %.2f feet", distanceInMiles, distanceInFeet);
    }

    public static void Run() {
        MilesToFeetInteractive milesToFeet = new MilesToFeetInteractive();
        milesToFeet.displayDistance();
    }
}
