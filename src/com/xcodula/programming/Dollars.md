# Dollars.java - Program Details

## Description

This program is the solution to exercise problem 10 from page 114 of *Java Programming, 7th Edition* by Joyce Farrell.

Write a class that calculates and displays the conversion of an entered number of dollars into currency denominations -
20s, 10s, 5s, and 1s.  Save the class as **Dollars.java**.

## Designing the Program

This program will need a class defined that will be a container of total 20s, 10s, 5s, and 1s for a giving amount of 
dollars.  

We need the ability to capture the input for the total dollar amount.  

The program needs to have the ability to break down the total number of dollars into the appropriate denominations.  


## The Code

    import java.util.Scanner;

    public class Dollars {

        public int getInput() {
            int result = 0;
            try {
                Scanner deviceInput = new Scanner(System.in);
                System.out.print("Enter total dollars >> ");
                result = deviceInput.nextInt();
            } catch (Exception e) {
                System.out.println(e.getStackTrace());
            }
            return result;
        }

        public Denominations performCalculation(int totalDollars) {
            Denominations result = new Denominations();
            int remainder = 0;
            result.setTotal20s(totalDollars / 20);
            remainder = totalDollars % 20;
            result.setTotal10s(remainder / 10);
            remainder = remainder % 10;
            result.setTotal5s(remainder / 5);
            remainder = remainder % 5;
            result.setTotal1s(remainder);
            return result;
        }

        public String displayDenominations(int totalDollars) {
            String str = "";
            Denominations denominations = performCalculation(totalDollars);
            str += String.format("%d breaks down into\n", totalDollars);
            str += String.format("20s -- %d\n", denominations.getTotal20s());
            str += String.format("10s -- %d\n", denominations.getTotal10s());
            str += String.format(" 5s -- %d\n", denominations.getTotal5s());
            str += String.format(" 1s -- %d\n", denominations.getTotal1s());
            return str;
        }

        public static void run() {
            Dollars dollars = new Dollars();
            int totalDollars = dollars.getInput();
            String output = dollars.displayDenominations(totalDollars);
            System.out.println(output);
        }

        public class Denominations {
            private int total20s;
            private int total10s;
            private int total5s;
            private int total1s;

            public int getTotal20s() {
                return total20s;
            }

            public void setTotal20s(int total20s) {
                this.total20s = total20s;
            }

            public int getTotal10s() {
                return total10s;
            }

            public void setTotal10s(int total10s) {
                this.total10s = total10s;
            }

            public int getTotal5s() {
                return total5s;
            }

            public void setTotal5s(int total5s) {
                this.total5s = total5s;
            }

            public int getTotal1s() {
                return total1s;
            }

            public void setTotal1s(int total1s) {
                this.total1s = total1s;
            }
        }
    }

## Running the Program

Here's a sample run of the program.  

    Enter total dollars >> 36
    $36 breaks down into
    $20 -- 1
    $10 -- 1
     $5 -- 1
     $1 -- 1


## Conclusion

