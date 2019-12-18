import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SudokuTestSuite {

    @Test
    public void testSudokuElementValueListNotEmpty() {
        //given
        SudokuElement element = new SudokuElement();
        List<Integer> sudokuValues = new ArrayList<>();
        for (int i = 1; i <= 9 ; i++) {
            sudokuValues.add(i);
        }
        //when
        List<Integer> possibleValuesList = element.getPossibleValuesList();
        boolean empty = possibleValuesList.isEmpty();
        //then
        Assert.assertFalse(empty);

    }

    @Test
    public void testSudokuElementListIsCorrectSize() {
        //given
        SudokuElement element = new SudokuElement();
        List<Integer> sudokuValues = new ArrayList<>();
        for (int i = 1; i <= 9 ; i++) {
            sudokuValues.add(i);
        }
        //when
        List<Integer> possibleValuesList = element.getPossibleValuesList();
        int size = possibleValuesList.size();
        //then
        Assert.assertEquals(9, size);
    }

    @Test
    public void testSudokuElementListContainsCorrectValues() {
        //given
        SudokuElement element = new SudokuElement();
        List<Integer> sudokuValues = new ArrayList<>();
        for (int i = 1; i <= 9 ; i++) {
            sudokuValues.add(i);
        }
        //when
        List<Integer> possibleValuesList = element.getPossibleValuesList();
        boolean containsAll = possibleValuesList.containsAll(sudokuValues);
        //then
        Assert.assertTrue(containsAll);
    }

//    @Test
//    public void testSudokuBoardDrawerDrawsCorrectBoard() {
//        //given
//        SudokuBoard board = new SudokuBoard();
//        //when
//        BoardCreator.prapareNewBoard(board);
//        //then
//        BoardDrawer.printSudokuBoard(board);
//
//    }
//
//    @Test
//    public void testSudokuBoardDrawerPrintsPossibleValues() {
//        //given
//        SudokuBoard board = new SudokuBoard();
//        //when
//        BoardCreator.prapareNewBoard(board);
//        //then
//        BoardDrawer.printSudokuBoardPossibleValues(board);
//
//    }
}
