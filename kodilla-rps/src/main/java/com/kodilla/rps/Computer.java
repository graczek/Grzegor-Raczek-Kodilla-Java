package com.kodilla.rps;

import java.util.Random;

public class Computer {

    private Random rnd = new Random();

    public int pickComputersMove(){
        return rnd.nextInt(3) + 1;
    }
}
