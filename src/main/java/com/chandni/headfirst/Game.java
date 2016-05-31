package com.chandni.headfirst;

import java.io.PrintStream;

public class Game {
    public void go() {
        System.out.println("hello World");

        int x = (int) (Math.random() * 10 + 1);

        System.out.println("I'm thinking of an integer between 1 and 10.");
        System.out.println("Guess what my number is:");

        PrintStream printStream = new PrintStream(System.out);
        Player player = new Player(printStream);

        int guess = player.getGuess();

        if (guess == x) {
            System.out.println("you are correct I was thinking of " + x);
        } else {
            System.out.println("better luck next time,  I was thinking of " + x);
        }


    }
}
