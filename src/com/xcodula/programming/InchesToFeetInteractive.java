package com.xcodula.programming;

import java.util.Scanner;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Programming Exercise 6.b, page 113
 */
public class InchesToFeetInteractive extends InchesToFeet {
    public void getInput() {
        try {
            Scanner inputDevice = new Scanner(System.in);
            System.out.print("Please enter inches >> ");
            int inches = inputDevice.nextInt();
            setInches(inches);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Run() {
        InchesToFeetInteractive inchesToFeet = new InchesToFeetInteractive();
        inchesToFeet.getInput();
        System.out.println(inchesToFeet);
    }
}
