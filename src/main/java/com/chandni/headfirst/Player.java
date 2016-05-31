package com.chandni.headfirst;

import java.io.*;

public class Player {
    private PrintStream printStream;

    public Player(PrintStream printStream) {

        this.printStream = printStream;
    }

    public int getGuess() {
        String thisLine = null;
        int guess = 0;
        printStream.println("Please enter you guess");

        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            if (!bufferedReader.readLine().equals(null)) {
                guess = Integer.parseInt(bufferedReader.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return guess;
    }


}
