package com.xcodula.programming;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Programming Exercise 4.a, page 113
 */
public class MilesToFeet {
    public static final int FEET_IN_MILE = 5280;
    private double distanceInMiles = 8.5;

    public void displayDistance() {
        double distanceInFeet = distanceInMiles * FEET_IN_MILE;
        System.out.printf("The distance to my uncle's house is %.2f miles or %.2f feet", distanceInMiles, distanceInFeet);
    }

    public static void Run() {
        MilesToFeet milesToFeet = new MilesToFeet();
        milesToFeet.displayDistance();
    }
}
