public class BoardDrawer {

    public static void printSudokuBoard(SudokuBoard board) {
        String result = "";
        for (int i = 0; i <= 8; i++) {
            result += "|";
            for (int j = 0; j <= 8; j++) {
                if (board.getSudokuRowList().get(i).getSudokuElementList().get(j).getValue() == SudokuElement.EMPTY) {
                    result += "-";
                } else {
                    result += board.getSudokuRowList().get(i).getSudokuElementList().get(j).getValue().toString();
                }
                result += "|";
            }
            result += "\n";
        }
        System.out.println(result);
    }

    public static void printSudokuBoardPossibleValues(SudokuBoard board) {
        String result = "";
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                result += board.getSudokuRowList().get(i).getSudokuElementList().get(j).getPossibleValuesList().toString();
            }
            result += "\n";
        }

        System.out.println(result);
    }
}
