# DogBoarding.java - Program Details

## Description

This program is the solution to exercise problem 9 from page 114 of *Java Programming, 7th Edition* by Joyce Farrell.

## Designing the Program

This program will need to have the ability to take in user input for the weight of the dog and the number of days to 
have the dog boarded.  We can use the Scanner class to get input, so that mean's we'll need to import the Scanner
package.  

I have made a choice to encapsulate the weight of the dog and the number of days to board the dog in a separate class.
I like to have classes that just contain data fields and a separate class that is able to operate on that data.  Its 
just a personal design choice.  This doesn't mean that I'll always choose this path.  

The requirement for the cost per pound of 50 cents is prime for a runtime constant value, so that will become a static
final double value.

The heart of the program will involve the calculation of the total cost to board a dog.  This is a simple calculation of
the weight of the dog multiplied by the cost per pound multiplied by the total days of boarding.  

Finally, we need to create some method of displaying the order details and the total cost.

## The Code

    import java.util.Scanner;
    
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

## Running the Program

Here's a sample run of the program.  

    Enter dog's weight >> 24
    Enter total number of days to board >> 2
    Dog's weight: 24
    Total days of boarding: 2
    Total cost: $24.00

## Conclusion


