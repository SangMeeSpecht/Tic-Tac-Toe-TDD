import java.io.PrintStream;
import java.util.HashMap;

/**
 * Created by sspecht on 1/13/17.
 */

public class Board {
    private PrintStream printStream;
    private HashMap<String, String> board;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
        board = createFirstBoard();
    }

    public void displayBoard() {
        String one = board.get("1");
        String two = board.get("2");
        String three = board.get("3");
        String four = board.get("4");
        String five = board.get("5");
        String six = board.get("6");
        String seven = board.get("7");
        String eight = board.get("8");
        String nine = board.get("9");
        String divider = "-----";

        String board = String.format("%s|%s|%s\n%s\n%s|%s|%s\n%s\n%s|%s|%s\n", one, two, three, divider, four, five, six, divider, seven, eight, nine);

        printStream.println(board);
    }

    public void updateBoard(String userPosition, String playerSymbol) {
        board.put(userPosition, playerSymbol);
    }

    private HashMap<String, String> createFirstBoard() {
        HashMap<String, String> firstBoard = new HashMap<String, String>();
        firstBoard.put("1", "1");
        firstBoard.put("2", "2");
        firstBoard.put("3", "3");
        firstBoard.put("4", "4");
        firstBoard.put("5", "5");
        firstBoard.put("6", "6");
        firstBoard.put("7", "7");
        firstBoard.put("8", "8");
        firstBoard.put("9", "9");

        return firstBoard;
    }
}
