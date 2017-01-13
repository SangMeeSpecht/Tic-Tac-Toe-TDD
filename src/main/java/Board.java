import java.io.PrintStream;

/**
 * Created by sspecht on 1/13/17.
 */
public class Board {
    private PrintStream printStream;

    public Board(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void displayBoard() {
        printStream.println("1|2|3\n-----\n4|5|6\n-----\n7|8|9\n");
    }
}
