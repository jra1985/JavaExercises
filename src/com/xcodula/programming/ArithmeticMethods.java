package com.xcodula.programming;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Programming Exercise 3a, page 172
 */
public class ArithmeticMethods {
    public static void run(String[] args) {
        try {
            int value1 = Integer.parseInt(args[0]);
            int value2 = Integer.parseInt(args[1]);
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
