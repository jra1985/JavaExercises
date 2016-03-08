package com.xcodula.programming;

import java.util.Scanner;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Programming Exercise 12, page 114
 */
public class TicketNumber {

    public int getInput() {
        int ticketNumber = -1;
        try {
            Scanner deviceInput = new Scanner(System.in);
            System.out.print("Enter a ticket number >> ");
            ticketNumber = deviceInput.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ticketNumber;
    }

    public TicketNumberModel getTicketNumberModel(int ticketNumber) {
        // This should throw if the number is longer than 6 digits
        String ticketNumberStr = Integer.toString(ticketNumber);

        // Get the first five digits of the given number
        String firstFiveStr = ticketNumberStr.substring(0, 5);
        int firstFive = Integer.parseInt(firstFiveStr);

        // Get the final digit of the given number
        char finalDigitChar = ticketNumberStr.charAt(5);
        int finalDigit = Integer.parseInt(Character.toString(finalDigitChar));

        // Populate the model with the values determined for the first five
        // digits and the final digit.
        TicketNumberModel ticketNumberModel = new TicketNumberModel();
        ticketNumberModel.setTicketNumber(ticketNumber);
        ticketNumberModel.setFinalDigit(finalDigit);
        ticketNumberModel.setFirstFive(firstFive);
        return ticketNumberModel;
    }

    public static void run() {
        TicketNumber ticketNumber = new TicketNumber();
        int number = ticketNumber.getInput();
        TicketNumberModel ticketNumberModel = ticketNumber.getTicketNumberModel(number);
        System.out.format("%d %s a valid number", number, ticketNumberModel.isValid() ? "is" : "is not");
    }

    public class TicketNumberModel {
        private int ticketNumber;
        private int firstFive;
        private int finalDigit;

        public boolean isValid() {
            return getFinalDigit() == (getFirstFive() % 7);
        }

        public int getTicketNumber() {
            return ticketNumber;
        }

        public void setTicketNumber(int ticketNumber) {
            this.ticketNumber = ticketNumber;
        }

        public int getFirstFive() {
            return firstFive;
        }

        public void setFirstFive(int firstFive) {
            this.firstFive = firstFive;
        }

        public int getFinalDigit() {
            return finalDigit;
        }

        public void setFinalDigit(int finalDigit) {
            this.finalDigit = finalDigit;
        }
    }
}
