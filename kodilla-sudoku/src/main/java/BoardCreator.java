public class BoardCreator {

    private static final int MIN = 1;
    private static final int MAX = 9;

    public static void prapareNewBoard(SudokuBoard board){
        SudokuRow sudokuRow;
        for (int i = MIN; i <= MAX; i++) {
            sudokuRow = new SudokuRow();
            for (int j = MIN; j <= MAX; j++) {
                sudokuRow.getSudokuElementList().add(new SudokuElement());
            }
            board.getSudokuRowList().add(sudokuRow);
        }
    }
}
