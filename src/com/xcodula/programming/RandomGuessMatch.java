package com.xcodula.programming;

import java.util.Scanner;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Game Zone Exercise 2, page 115
 */
public class RandomGuessMatch {
    public int getRandomNumber() {
        return 1 + (int)(Math.random() * 5);
    }

    public int getInput() {
        int guess = -1;
        try {
            Scanner deviceInput = new Scanner(System.in);
            System.out.print("Guess a number from 1 to 5 >> ");
            guess = deviceInput.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return guess;
    }

    public void run() {
        int randomNum = getRandomNumber();
        int guess = getInput();
        boolean isCorrect = randomNum == guess;
        int diff = Math.abs(randomNum - guess);
        System.out.format("The difference is %d\n", diff);
        System.out.format("The number is %d and your guess is %b\n", randomNum, isCorrect);
    }

    public static void main(String[] args) {
        RandomGuessMatch randomGuessMatch = new RandomGuessMatch();
        randomGuessMatch.run();
    }
}
