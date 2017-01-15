import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by sspecht on 1/13/17.
 */

public class BoardTest {
    private PrintStream printStream;
    private Board board;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldDisplayBoard() {
        board.displayBoard();

        verify(printStream).println("1|2|3\n-----\n4|5|6\n-----\n7|8|9\n");
    }

    @Test
    public void shouldDisplayUpdatedBoardPositionWhenUserChoosesNumber() throws IOException {
        board.updateBoard("5", "X");
        board.displayBoard();

        verify(printStream).println("1|2|3\n-----\n4|X|6\n-----\n7|8|9\n");
    }
}