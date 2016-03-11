package com.xcodula.programming;

import java.util.Scanner;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Exercise 7, page 173
 */
public class PaintCalculator {
    public static final int COVERAGE_AREA = 350;
    public static final int PRICE_PER_GALLON = 32;

    public static void main(String[] args) {
        PaintCalculator paintCalculator = new PaintCalculator();
        DimensionsModel dimensionsModel = paintCalculator.getInput();
        int wallArea = paintCalculator.getWallArea(dimensionsModel);
        int gallons = paintCalculator.paintNeeded(wallArea);
        int price = paintCalculator.getPrice(gallons);
        String output = "";
        output += String.format("Length: %d\n", dimensionsModel.getLength());
        output += String.format("Width: %d\n", dimensionsModel.getWidth());
        output += String.format("Height: %d\n", dimensionsModel.getHeight());
        output += String.format("Wall area: %d\n", wallArea);
        output += String.format("Gallons needed: %d\n", gallons);
        output += String.format("Price: %d\n", price);
        System.out.println(output);
    }

    public int getWallArea(DimensionsModel dimensionsModel) {
        return ( 2 * dimensionsModel.getHeight() * dimensionsModel.getLength() ) +
               ( 2 * dimensionsModel.getHeight() * dimensionsModel.getWidth() );
    }

    public int getPrice(int gallons) {
        return gallons * PRICE_PER_GALLON;
    }

    public int paintNeeded(int wallArea) {
        return (int)Math.ceil(wallArea / COVERAGE_AREA);
    }

    public DimensionsModel getInput() {
        DimensionsModel dimensionsModel = new DimensionsModel();

        try {
            Scanner deviceInput = new Scanner(System.in);

            System.out.print("Enter length of room >> ");
            dimensionsModel.setLength(deviceInput.nextInt());

            System.out.print("Enter width of room >> ");
            dimensionsModel.setWidth(deviceInput.nextInt());

            System.out.print("Enter height of room >> ");
            dimensionsModel.setHeight(deviceInput.nextInt());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dimensionsModel;
    }

    public class DimensionsModel {
        private int length;
        private int height;
        private int width;

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }
}
