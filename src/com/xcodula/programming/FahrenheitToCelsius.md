# FahrenheitToCelsius.java - Program Details

## Description

This program is the solution to exercise problem 11 from page 114 of *Java Programming, 7th Edition* by Joyce Farrell.

## Designing the Program

I think that I will just create a straight procedural program to do this conversion.  There doesn't seem to be much 
reason to make it too complicated.

## The Code

    import java.util.Scanner;

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

## Running the Program

Here's a sample run of the program.  

    Enter a temperature in Fahrenheit >> 80.0
    80.0 degrees Fahrenheit converts to 26.7 degrees Celsius

## Conclusion
