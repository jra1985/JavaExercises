package com.xcodula.programming;

import java.util.Scanner;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Programming Exercise 8, page 114
 */
public class Eggs {
    public static final double DOZEN_EGGS_COST = 3.25;
    public static final double INDIVIDUAL_EGG_COST = 0.45;
    private int _totalEggs = 0;

    public int getTotalEggs() {
        return _totalEggs;
    }

    public void setTotalEggs(int totalEggs) {
        this._totalEggs = totalEggs;
    }

    public void getInput() {
        try {
            Scanner deviceInput = new Scanner(System.in);
            System.out.print("Enter amount of eggs to buy >>> ");
            int eggs = deviceInput.nextInt();
            setTotalEggs(eggs);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public String calculateCost(int eggs) {
        int dozenCount = eggs / 12;
        int singleEggs = eggs % 12;
        double cost = dozenCount * DOZEN_EGGS_COST + singleEggs * INDIVIDUAL_EGG_COST;
        // It would be nice to find a better way to create a formatted string with
        // so many different formatted inputs in the string.
        String str = "";
        str += String.format("You ordered %d eggs.  ", eggs);
        str += String.format("That's %d dozen ", dozenCount);
        str += String.format("at $%.2f per dozen ", DOZEN_EGGS_COST);
        str += String.format("and %d loose eggs ", singleEggs);
        str += String.format("at $%.2f each ", INDIVIDUAL_EGG_COST);
        str += String.format("for a total of $%.2f", cost);
        return str;
    }

    public static void run() {
        Eggs eggs = new Eggs();
        eggs.getInput();
        System.out.println(eggs.calculateCost(eggs.getTotalEggs()));
    }
}
