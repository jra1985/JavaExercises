package com.xcodula.programming;

import java.util.Scanner;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Programming Exercise 9, page 114
 */
public class DogBoarding {
    public static final double COST_PER_LBS = 0.50;

    public OrderData getInput() {
        OrderData orderData = new OrderData();
        try {
            Scanner deviceInput = new Scanner(System.in);
            System.out.print("Enter dog's weight >> ");
            orderData.setWeightOfDog(deviceInput.nextInt());
            System.out.print("Enter total number of days to board >> ");
            orderData.setTotalDays(deviceInput.nextInt());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        return orderData;
    }

    public double calculateCost(OrderData orderData) {
        return orderData.getWeightOfDog() * COST_PER_LBS * orderData.getTotalDays();
    }

    public String getOrderDetails(OrderData orderData) {
        String str = "";
        double calculatedCost = calculateCost(orderData);
        str += String.format("Dog's weight: %d\n", orderData.getWeightOfDog());
        str += String.format("Total days of boarding: %d\n", orderData.getTotalDays());
        str += String.format("Total cost: $%.2f\n", calculatedCost);
        return str;
    }

    public static void run() {
        DogBoarding dogBoarding = new DogBoarding();
        OrderData orderData = dogBoarding.getInput();
        String orderDetails = dogBoarding.getOrderDetails(orderData);
        System.out.println(orderDetails);
    }

    public class OrderData {
        private int weightOfDog;
        private int totalDays;

        public int getWeightOfDog() {
            return weightOfDog;
        }

        public void setWeightOfDog(int weightOfDog) {
            this.weightOfDog = weightOfDog;
        }

        public int getTotalDays() {
            return totalDays;
        }

        public void setTotalDays(int totalDays) {
            this.totalDays = totalDays;
        }
    }
}
