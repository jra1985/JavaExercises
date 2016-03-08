package com.xcodula.programming;

import java.util.Scanner;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Programming Exercise 11, page 114
 */
public class FahrenheitToCelsius {
    public static void run() {
        try {
            Scanner deviceInput = new Scanner(System.in);
            System.out.print("Enter a temperature in Fahrenheit >> ");
            double fahrenheit = deviceInput.nextDouble();
            double celsius = (fahrenheit - 32.0) * (5.0 / 9.0);
            System.out.format("%.1f degrees Fahrenheit converts to %.1f degrees Celsius", fahrenheit, celsius);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
