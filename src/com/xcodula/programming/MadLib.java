package com.xcodula.programming;

import java.util.Scanner;

/*
 * From the 'Java Programming' book by Joyce Farrell
 * Chapter 2, Game Zone Exercise 1, page 115
 */
public class MadLib {

    public static void main(String[] args) {
        MadLib madLib = new MadLib();
        Words words = madLib.getInput();
        String output = madLib.createMadLib(words);
        System.out.println(output);
    }

    public Words getInput() {
        Words words = new Words();

        Scanner deviceInput = new Scanner(System.in);

        System.out.print("Name a noun >> ");
        words.setNoun1(deviceInput.next());

        System.out.print("Name another noun >> ");
        words.setNoun2(deviceInput.next());

        System.out.print("Name yet another noun >> ");
        words.setNoun3(deviceInput.next());

        System.out.print("Name a past tense verb >> ");
        words.setPastTenseVerb(deviceInput.next());

        System.out.print("Name a verb >> ");
        words.setVerb(deviceInput.next());

        return words;
    }

    public String createMadLib(Words words) {
        String str = "";
        str += String.format("Hey diddle diddle,\n");
        str += String.format("The %s and the fiddle,\n", words.getNoun1());
        str += String.format("The %s jumped over the moon.\n", words.getNoun2());
        str += String.format("The little dog %s,\n", words.getPastTenseVerb());
        str += String.format("To %s such sport,\n", words.getVerb());
        str += String.format("And the %s ran away with the spoon.\n", words.getNoun3());
        return str;
    }


    public class Words {
        private String noun1;
        private String noun2;
        private String noun3;
        private String pastTenseVerb;
        private String verb;

        public String getNoun1() {
            return noun1;
        }

        public void setNoun1(String noun1) {
            this.noun1 = noun1;
        }

        public String getNoun2() {
            return noun2;
        }

        public void setNoun2(String noun2) {
            this.noun2 = noun2;
        }

        public String getNoun3() {
            return noun3;
        }

        public void setNoun3(String noun3) {
            this.noun3 = noun3;
        }

        public String getVerb() {
            return verb;
        }

        public void setVerb(String verb) {
            this.verb = verb;
        }

        public String getPastTenseVerb() {
            return pastTenseVerb;
        }

        public void setPastTenseVerb(String pastTenseVerb) {
            this.pastTenseVerb = pastTenseVerb;
        }
    }
}
