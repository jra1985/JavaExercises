package com.xcodula.programming;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Programming Exercise 6.a, page 113
 */
public class InchesToFeet {
    public static final int InchesInFoot = 12;
    private int _inches = 0;

    public int getInches() {
        return _inches;
    }

    public void setInches(int inches) {
        _inches = inches;
    }

    private String convertInchesToFeet(int inches) {
        int feet = inches / InchesInFoot;
        int remainingInches = inches % InchesInFoot;
        return String.format("%d feet and %d inches", feet, remainingInches);
    }

    public String toString() {
        int inches = getInches();
        String conversion = convertInchesToFeet(inches);
        return String.format("%d inches converts to %s\n", inches, conversion);
    }

    public static void Run() {
        InchesToFeet inchesToFeet = new InchesToFeet();
        inchesToFeet.setInches(86);
        System.out.println(inchesToFeet);
    }
}
