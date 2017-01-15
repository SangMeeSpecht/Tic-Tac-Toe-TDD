import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by sspecht on 1/14/17.
 */

public class Player {
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;
    private String symbol;

    public Player(PrintStream printStream, BufferedReader bufferedReader, Board board, String symbol) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.board = board;
        this.symbol = symbol;
    }

    public void makeMove() {
        Boolean moveUnsuccessful = true;

        while(moveUnsuccessful) {
            try {
                attemptToUpdateBoard();
                break;
            } catch (InputException e) {
                e.displayLocationTaken();
            }
        }

        board.displayBoard();
    }

    private void attemptToUpdateBoard() throws InputException {
        displayNumberPrompt();
        String userInput = readUserInput();
        board.checkForPositionVacancy(userInput);
        board.updateBoard(userInput, symbol);
    }

    private String readUserInput() {
        String position = "";
        try {
            position = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return position;
    }

    private void displayNumberPrompt() {
        printStream.println("Please pick a number to make a move.\n");
    }
}
