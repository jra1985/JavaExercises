# ArithmeticMethods.java - Program Details

## Description

This program is the solution to exercise problem 3a from page 172 of *Java Programming, 7th Edition* by Joyce Farrell.

## Designing the Program

The problem statement for this program defines what to do and how to name the methods to be called.  The only tricky 
part might be where the command line arguments must be parsed into integer values.  This is where things could go 
sideways so I decided to wrap my logic in a try/catch statement.  My IDE (Intellij) decided to make the exception it
caught to be a NumberFormatException.  I went ahead and added a general Exception block below that in case there were
other problems with command line arguments.  

## The Code

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

## Running the Program

Here's a sample run of the program.  

    1 plus 10 is 11
    2 plus 10 is 12
    1 plus 100 is 101
    2 plus 100 is 102
    1 plus 1000 is 1001
    2 plus 1000 is 1002

## Conclusion
