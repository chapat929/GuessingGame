package com.chandni.headfirst;

import java.io.PrintStream;

public class Game {

    private Player player1;
    private Player player2;
    private Player player3;

    public void go() {
        PrintStream printStream = new PrintStream(System.out);
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        boolean player1IsRight = false;
        boolean player2IsRight = false;
        boolean player3IsRight = false;

        int tragetNumber = (int) (Math.random() * 10 + 1);
        System.out.println("I'm thinking of an integer between 1 and 10.");
        while (true) {
            System.out.println("Guess what my number is:");

            player1.getGuess();
            player2.getGuess();
            player3.getGuess();

            System.out.println("Player 1 guessed: " + player1.number);
            System.out.println("Player 2 guessed: " + player2.number);
            System.out.println("Player 3 guessed: " + player3.number);


            if (player1.number == tragetNumber) {
                player1IsRight = true;
            }
            if (player2.number == tragetNumber) {
                player2IsRight = true;
            }
            if (player3.number == tragetNumber) {
                player3IsRight = true;
            }

            if (player1IsRight || player2IsRight || player3IsRight) {
                System.out.println("We have a winner!");
                System.out.println("Player 1 got it right? " + player1IsRight);
                System.out.println("Player 2 got it right? " + player2IsRight);
                System.out.println("Player 3 got it right? " + player3IsRight);
                System.out.println("Game is over");
                break;
            } else {
                System.out.println("Players will have to try again!");
            }




        }
    }
}
