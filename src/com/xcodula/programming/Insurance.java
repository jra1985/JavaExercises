package com.xcodula.programming;

import java.util.Scanner;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 3, Exercise 8, page 173
 */
public class Insurance {
    public void run() {
        DataModel dataModel = getInput();
        int premium = getPremium(dataModel);
        System.out.format("The premium amount is $%d\n", premium);
    }

    public int getPremium(DataModel dataModel) {
        int age = dataModel.getCurrentYear() - dataModel.getBirthYear();
        int decade = age / 10;
        return ( decade + 15 ) * 20;
    }

    public DataModel getInput() {
        DataModel dataModel = new DataModel();
        try {
            Scanner deviceInput = new Scanner(System.in);
            System.out.print("Enter the current year >> ");
            dataModel.setCurrentYear(deviceInput.nextInt());
            System.out.print("Enter birth year >> ");
            dataModel.setBirthYear(deviceInput.nextInt());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataModel;
    }

    public static void main(String[] args) {
        Insurance insurance = new Insurance();
        insurance.run();
    }

    public class DataModel {
        private int birthYear;
        private int currentYear;

        public int getBirthYear() {
            return birthYear;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        public int getCurrentYear() {
            return currentYear;
        }

        public void setCurrentYear(int currentYear) {
            this.currentYear = currentYear;
        }
    }
}
