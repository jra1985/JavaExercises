# ArithmeticMethods2.java - Program Details

## Description

This program is the solution to exercise problem 3b from page 172 of *Java Programming, 7th Edition* by Joyce Farrell.

## Designing the Program

This program is nearly a cut and paste of ArithmeticMethods.java from exercise 3a.  The first five lines inside the 
try/catch block of the run() method are about the only differences.

## The Code

    import java.util.Scanner;
    
    public class ArithmeticMethods {
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

## Running the Program

Here's a sample run of the program.  

    1 plus 10 is 11
    2 plus 10 is 12
    1 plus 100 is 101
    2 plus 100 is 102
    1 plus 1000 is 1001
    2 plus 1000 is 1002

## Conclusion
