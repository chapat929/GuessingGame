package com.chandni.headfirst;

import java.io.PrintStream;

public class Player {
    private PrintStream printStream;

    public Player(PrintStream printStream) {

        this.printStream = printStream;
    }

    public int getGuess() {

        return 5;
    }
}
