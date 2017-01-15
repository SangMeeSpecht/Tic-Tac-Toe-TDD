import java.io.PrintStream;

/**
 * Created by sspecht on 1/14/17.
 */

public class InputException extends Exception {
    PrintStream printStream;

    public InputException(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void displayLocationTaken() {
        printStream.println("Location already taken.");
    }
}

