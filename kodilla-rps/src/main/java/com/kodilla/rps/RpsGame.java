package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {

    private String playerName;
    private boolean end = false;
    private int noOfRounds;
    private char playersMove;
    private char computersMove;
    private int playersPoints = 0;
    private int computersPoints = 0;
    private String availableMoves = "123";

    private Scanner sc = new Scanner(System.in);
    private Random rnd = new Random();

    public void runGame(){
        checkIfNextRoundToPlay();
        while(!end) {
            initGame();
            playRound();
        }
    }

    public void checkIfNextRoundToPlay(){
        int noOfRounds = getNoOfRounds();
        if(noOfRounds > 0){
            end = true;
        } else {
            end = false;
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
        computersMove = pickComputersMove(availableMoves);
        displayComputersMove();
        displayRoundWinnerInfo(playersMove, computersMove);
        displayScore();
        substractRound(noOfRounds);
        checkIfNextRoundToPlay();

        //policz wynik
        //pokaz wynik
        //sprawdz czy kolejna runda
        //wyswietl zwyciezce
    }

    private void displayRoundInfo() {
        System.out.println("\nRounda " + getNoOfRounds() +":");
        substractRound(noOfRounds);
    }

    public void displayMoveChoiceRequest(){
        System.out.println("\nWybierz ruch (1 = kamień / 2 = papier / 3 = nożyce) : \n");
    }

    public char readPlayersMove(){
        return sc.next().charAt(0);
    }

    public void displayPlayersMove(){
        System.out.println("Twoje zagranie to: " + translateMoveIntoDescription(playersMove));
    }

    public String translateMoveIntoDescription(char move){
        //change to switch case
        if(move == '1') return "kamień";
        if(move == '2') return "papier";
        if(move == '3') return "nożyce";
        if(move == 'x') return "koniec gry";
        if(move == 'n') return "zaczynamy od nowa!";
        else {
            System.out.println("Nieporawny ruch");
            displayMoveChoiceRequest();
            return "Niepoprawny ruch";
        }
    }

    public char pickComputersMove(String availableMoves){
        return availableMoves.charAt(rnd.nextInt(availableMoves.length()));
    }

    public void displayComputersMove(){
        System.out.println("Zagranie komputera to: " + translateMoveIntoDescription(computersMove) + "\n");
    }

    public void displayRoundWinnerInfo(char playersMove, char computersMove){
        if(playersMove < computersMove){
            System.out.println("Wygrałeś rundę!");
            playersPoints++;
        }
        if(computersMove < playersMove){
            System.out.println("Wygrał komputer!:(");
            computersPoints++;
        }
        if(playersMove == computersMove){
            System.out.println("Remis!");
            playersPoints++;
            computersPoints++;
        }
    }

    public void displayScore(){
        System.out.println("\nObecny Wynik: ");
        System.out.println(playerName.toUpperCase() + ": " + getPlayersPoints() + " vs COMPUTER: " + getComputersPoints());
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

    public int substractRound(int noOfRounds){
        return noOfRounds--;
    }
}
