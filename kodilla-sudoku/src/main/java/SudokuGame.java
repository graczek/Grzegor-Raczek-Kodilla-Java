public class SudokuGame {

    public static void main(String[] args) {

        SudokuBoard board = new SudokuBoard();
        BoardCreator.prapareNewBoard(board);

        BoardDrawer.printSudokuBoard(board);
        BoardDrawer.printSudokuBoardPossibleValues(board);


    }
}
