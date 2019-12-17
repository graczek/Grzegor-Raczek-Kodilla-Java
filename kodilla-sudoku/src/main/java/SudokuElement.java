import java.util.ArrayList;
import java.util.List;

public class SudokuElement {

    public static final int EMPTY = -1;

    private Integer value;
    private List<Integer> possibleValuesList;

    public SudokuElement() {
        this.value = EMPTY;
        this.possibleValuesList = new ArrayList<>();
        addPossibleValuesToList();
    }

    private void addPossibleValuesToList(){
        for (int i = 1; i <= 9; i++) {
            possibleValuesList.add(i);
        }
    }

    public Integer getValue() {
        return value;
    }

    public List<Integer> getPossibleValuesList() {
        return possibleValuesList;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
