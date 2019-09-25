package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {

    private String playerName;
    private int noOfRounds;
    private int playersMove;
    private int computersMove;
    private int playersPoints = 0;
    private int computersPoints = 0;

    private Scanner sc = new Scanner(System.in);
    private Random rnd = new Random();

    public void runGame(){
        initGame();
        playRound();
    }

    public void checkIfNextRoundToPlay(){
        int noOfRounds = getNoOfRounds();
        if(noOfRounds > 0){
            playRound();
        } else {
            System.out.println("Gra skończona");
            displayWinner();
        }
    }

    public void initGame(){
        System.out.println("Podaj imię: ");
        playerName = readPlayersName();
        System.out.println("Podaj liczbę rund do zagrania: ");
        noOfRounds = readNoOfRounds();
        displayWelcomeInformation();
        displayRules();
    }

    public String readPlayersName(){
        return sc.nextLine();
    }

    public int readNoOfRounds(){
        return sc.nextInt();
    }

    public void displayWelcomeInformation(){
        System.out.println("\nWitaj " + playerName + ". Twoja gra będzie składać się z " + noOfRounds + " rund.\n");
    }

    public void displayRules(){
        System.out.println("klawisz 1 - zagranie \"kamień\",\n" +
                "klawisz 2 - zagranie \"papier\",\n" +
                "klawisz 3 - zagranie \"nożyce\",\n" +
                "klawisz x - zakończenie gry,\n" +
                "klawisz n - uruchomienie gry od nowa,");
    }

    public void playRound(){
        displayRoundInfo();
        displayMoveChoiceRequest();
        playersMove = readPlayersMove();
        displayPlayersMove();
        computersMove = pickComputersMove();
        displayComputersMove();
        displayRoundWinnerInfo(determineWinningMove(playersMove, computersMove));
        displayScore();
        substractRound();
        checkIfNextRoundToPlay();
    }

    private void displayRoundInfo() {
        System.out.println("\nRounda " + getNoOfRounds() +":");
    }

    public void displayMoveChoiceRequest(){
        System.out.println("\nWybierz ruch (1 = kamień / 2 = papier / 3 = nożyce) : \n");
    }

    public int readPlayersMove(){
        return sc.nextInt();
    }

    public void displayPlayersMove(){
        System.out.println("Twoje zagranie to: " + translateMoveIntoDescription(playersMove));
    }

    public String translateMoveIntoDescription(int move){
        //change to switch case
        if(move == 1) return "kamień";
        if(move == 2) return "papier";
        if(move == 3) return "nożyce";
//        if(move == 'x') return "koniec gry";
//        if(move == 'n') return "zaczynamy od nowa!";
        else {
            return "Niepoprawny ruch";
        }
    }

    public int pickComputersMove(){
        return rnd.nextInt((3 - 1) + 1) + 1;
    }

    public void displayComputersMove(){
        System.out.println("Zagranie komputera to: " + translateMoveIntoDescription(computersMove) + "\n");
    }

    public void displayRoundWinnerInfo(int winningCase){
        switch(winningCase){
            case 0 :
                System.out.println("Remis!");
                playersPoints++;
                computersPoints++;
                break;

            case 1 :
                System.out.println("Wygrałeś rundę!");
                playersPoints++;
                break;

            case -1 :
                System.out.println("Wygrał komputer!:(");
                computersPoints++;
                break;
        }
    }

    public int determineWinningMove(int playersMove, int computersMove) {
        if(playersMove == computersMove) return 0;
        switch (playersMove) {
            case 1:
                return (computersMove == 3 ? 1 : -1);

            case 2:
                return (computersMove == 1 ? 1 : -1);

            case 3:
                return (computersMove == 2 ? 1 : -1);
        }
        return 0;
    }

    public void displayScore(){
        System.out.println("\nObecny Wynik: ");
        System.out.println(playerName.toUpperCase() + ": " + getPlayersPoints() + " vs COMPUTER: " + getComputersPoints());
    }

    public void displayWinner(){
        if(playersPoints > computersPoints){
            System.out.println("Wygrałeś!");
        } if (playersPoints < computersPoints){
            System.out.println("Tym razem rzegrałeś:(");
        } if (playersPoints == computersPoints){
            System.out.println("Remis!");
        }
    }

    public int getPlayersPoints() {
        return playersPoints;
    }

    public int getComputersPoints() {
        return computersPoints;
    }

    public int getNoOfRounds() {
        return noOfRounds;
    }

    public int substractRound(){
        return noOfRounds--;
    }
}
