package com.kodilla.rps;

public class RpsGame {

    //brakujace funkcjonalnosci (nowa gra/zakoncz)
    //testy

    private int noOfRounds;
    private int currentRound = 1;
    private int playersMove;
    private int computersMove;
    private int playersPoints = 0;
    private int computersPoints = 0;

    InputReader inputReader = new InputReader();
    Player player = new Player();
    Computer computer = new Computer();

    public void runGame(){
        initGame();
        playRound();
    }

    public void checkIfNextRoundToPlay(){
        int noOfRounds = getNoOfRounds();
        if(noOfRounds == 0){
            System.out.println("Gra skończona");
            displayWinner();
        } else {
            playRound();
        }
    }

    public void initGame(){
        askPlayersName();
        player.setPlayerName(inputReader.readPlayersName());
        askPlayerForNumberOfRounds();
        noOfRounds = inputReader.readNoOfRounds();
        displayWelcomeInformation();
        displayRules();
    }

    public void askPlayersName(){
        System.out.println("Podaj imię: ");
    }

    public void askPlayerForNumberOfRounds(){
        System.out.println("Podaj liczbę rund do zagrania: ");
    }

    public void displayWelcomeInformation(){
        System.out.println("\nWitaj " + player.getPlayerName() + ". Twoja gra będzie składać się z " + noOfRounds + " rund.\n");
    }

    public void displayRules(){
        System.out.println("klawisz 1 - zagranie \"kamień\",\n" +
                "klawisz 2 - zagranie \"papier\",\n" +
                "klawisz 3 - zagranie \"nożyce\",\n" +
                "klawisz x - zakończenie gry,\n" +
                "klawisz n - uruchomienie gry od nowa,");
    }

    public void playRound(){
        displayRoundNumber();
        displayMoveChoiceRequest();
        playersMove = inputReader.readPlayersMove();
        displayPlayersMove();
        computersMove = computer.pickComputersMove();
        displayComputersMove();
        displayRoundWinnerInfo(determineWinningMove(playersMove, computersMove));
        displayScore();
        noOfRounds--;
        checkIfNextRoundToPlay();
    }

    private void displayRoundNumber() {
        System.out.println("\nRounda " + currentRound +":");
        currentRound++;
    }

    public void displayMoveChoiceRequest(){
        System.out.println("\nWybierz ruch (1 = kamień / 2 = papier / 3 = nożyce) : \n");
    }

    public void displayPlayersMove(){
        System.out.println("Twoje zagranie to: " + translateMoveIntoDescription(playersMove));
    }

    public void displayComputersMove(){
        System.out.println("Zagranie komputera to: " + translateMoveIntoDescription(computersMove) + "\n");
    }

    public String translateMoveIntoDescription(int move){

        if(move == 1) return "kamień";
        if(move == 2) return "papier";
        if(move == 3) return "nożyce";
//        if(move == 'x') return "koniec gry";
//        if(move == 'n') return "zaczynamy od nowa!";
        else {
            return "Niepoprawny ruch";
        }
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

    //returns 1 if player's move wins, -1 if computer's move wins and 0 in case of a tie
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
        System.out.println(player.getPlayerName().toUpperCase() + ": " + getPlayersPoints() + " vs COMPUTER: " + getComputersPoints());
    }

    public void displayWinner(){
        if(playersPoints > computersPoints){
            System.out.println("Wygrałeś!");
        } if (playersPoints < computersPoints){
            System.out.println("Tym razem przegrałeś:(");
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

}
