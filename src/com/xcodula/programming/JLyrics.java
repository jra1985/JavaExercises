package com.xcodula.programming;

import javax.swing.*;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 14, Programming Exercise 1, page 796
 */
public class JLyrics {
    public static void run() {
        JFrame aFrame = new JFrame("JLyrics Program");
        aFrame.setSize(250, 100);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lyrics = new JLabel("Oops, I did it again");
        aFrame.add(lyrics);
        //aFrame.validate();
        //aFrame.repaint();
        aFrame.setVisible(true);
    }
}
