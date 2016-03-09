package com.xcodula.programming;

import java.util.Scanner;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Programming Exercise 3b, page 172
 */
public class ArithmeticMethods2 {
    public static void run() {
        try {
            Scanner deviceInput = new Scanner(System.in);
            System.out.print("Enter the first value >> ");
            int value1 = deviceInput.nextInt();
            System.out.print("Enter the second value >> ");
            int value2 = deviceInput.nextInt();
            displayNumberPlus10(value1);
            displayNumberPlus10(value2);
            displayNumberPlus100(value1);
            displayNumberPlus100(value2);
            displayNumberPlus1000(value1);
            displayNumberPlus1000(value2);
        } catch (NumberFormatException ne) {
            ne.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayNumberPlus10(int value) {
        System.out.format("%d plus 10 is %d\n", value, value + 10);
    }

    public static void displayNumberPlus100(int value) {
        System.out.format("%d plus 100 is %d\n", value, value + 100);
    }

    public static void displayNumberPlus1000(int value) {
        System.out.format("%d plus 1000 is %d\n", value, value + 1000);
    }
}
