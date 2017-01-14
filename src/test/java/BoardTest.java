import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by sspecht on 1/13/17.
 */

public class BoardTest {

    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = new Board(printStream, bufferedReader);
    }

    @Test
    public void shouldDisplayBoard() {
        board.displayBoard();

        verify(printStream).println("1|2|3\n-----\n4|5|6\n-----\n7|8|9\n");
    }

//    not passing right now
    @Test
    public void shouldDisplayUpdatedBoardPositionWhenUserChoosesNumber() throws IOException {
        when(bufferedReader.readLine()).thenReturn("5");
        board.makeMove();

        verify(printStream).println("1|2|3\n-----\n4|X|6\n-----\n7|8|9\n");

    }
}