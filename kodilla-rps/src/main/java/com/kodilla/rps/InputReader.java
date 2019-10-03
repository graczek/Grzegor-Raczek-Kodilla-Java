package com.kodilla.rps;

import java.util.Scanner;

public class InputReader {

    private Scanner sc = new Scanner(System.in);

    public String readPlayersName(){
        return sc.nextLine();
    }

    public int readNoOfRounds(){ return sc.nextInt(); }

    public int readPlayersMove(){
        //return sc.next().charAt(0);
        return sc.nextInt();
    }
}
