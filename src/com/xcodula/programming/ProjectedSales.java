package com.xcodula.programming;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Programming Exercise 5.a, page 113
 */
public class ProjectedSales {
    public static final double PROJECTED_SALES_INC = 0.10;
    protected double northDivisionSalesTotals = 4000.00;
    protected double southDivisionSalesTotals = 5500;

    public void displayProjectedSales() {
        System.out.printf("North Division current sales totals: %.2f\n", northDivisionSalesTotals);
        System.out.printf("North Division projected sales totals: %.2f\n",
                northDivisionSalesTotals * PROJECTED_SALES_INC + northDivisionSalesTotals);
        System.out.println();
        System.out.printf("South Division current sales totals: %.2f\n", southDivisionSalesTotals);
        System.out.printf("South Division projected sales totals: %.2f\n",
                southDivisionSalesTotals * PROJECTED_SALES_INC + southDivisionSalesTotals);
    }

    public static void Run() {
        ProjectedSales projectedSales = new ProjectedSales();
        projectedSales.displayProjectedSales();
    }
}
