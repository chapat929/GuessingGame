package com.chandni.headfirst;

import java.io.*;

public class Player {
    public int number = 0;

    public void getGuess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing the number " + number);
    }


}
