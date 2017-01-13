import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by sspecht on 1/13/17.
 */

public class BoardTest {

    @Test
    public void shouldDisplayBoard() {
        PrintStream printStream = mock(PrintStream.class);
        Board board = new Board(printStream);

        board.displayBoard();

        verify(printStream).println("1|2|3\n-----\n4|5|6\n-----\n7|8|9\n");
    }


}