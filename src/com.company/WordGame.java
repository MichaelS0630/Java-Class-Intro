package com.company;

import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        playGame();

}
    static void playGame(){
        System.out.println("--------Loading");
        System.out.println("------------Loading");
        System.out.println("-----------------Loading");
        System.out.println("--------------------Loading");
        System.out.println("------------------------Loading");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Done.");
        System.out.println("Welcome To The Deadliest Word Game Ever");
        System.out.println("Utilizing Java and (copying skills) we have designed a game that kills ");
        System.out.println("Enter Secret Word To Continue, Don't Let Anyone Know");
        String secretWord = new Scanner(System.in).next();
        System.out.println("The Secret Just lost It's letters" + " The Word Needs Help Getting All Of It's Constants And Vowels");
        System.out.println("Will You Help? + Enter Yes Or No");
        String willHelp = new Scanner(System.in).next();
        if (willHelp.toLowerCase() == "yes") {
            int numberOfGuesses = secretWord.length();
            System.out.println("You Have:" + numberOfGuesses + "Guesses");
            int guess = 0;
            while (guess < numberOfGuesses) {
                System.out.println("Guessing, Enter a Letter");
                String guessedChar = new Scanner(System.in).next();
                if (secretWord.contains(guessedChar)) {
                    System.out.println("B**** You Guessed It!");

                }
            }
        } else if (willHelp.toLowerCase() == "no")
            System.out.println("Really?");
        System.out.println("You suffered from a heart attack");
    }
}





