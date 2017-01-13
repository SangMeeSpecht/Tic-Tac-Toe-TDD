import java.io.PrintStream;

/**
 * Created by sspecht on 1/13/17.
 */
public class GamePrompter {
    PrintStream printStream;

    public GamePrompter(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void displayNumberPrompt() {
        printStream.println("Please pick a number to make a move.");
    }
}
