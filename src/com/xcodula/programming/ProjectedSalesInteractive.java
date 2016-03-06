package com.xcodula.programming;

import java.util.Scanner;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Programming Exercise 5.b, page 113
 */
public class ProjectedSalesInteractive extends ProjectedSales {
    public void getInput() {
        try {
            Scanner inputDevice = new Scanner(System.in);
            System.out.print("Please enter north division sales totals >> ");
            northDivisionSalesTotals = inputDevice.nextDouble();
            System.out.print("Please enter south division sales totals >> ");
            southDivisionSalesTotals = inputDevice.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Run() {
        ProjectedSalesInteractive projectedSales = new ProjectedSalesInteractive();
        projectedSales.getInput();
        projectedSales.displayProjectedSales();
    }
}
