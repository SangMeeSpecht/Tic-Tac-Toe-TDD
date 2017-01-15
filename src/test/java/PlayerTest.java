import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by sspecht on 1/14/17.
 */

public class PlayerTest {
    private Player player;
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;


    @Before
    public void setup() {
        bufferedReader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        player = new Player(printStream, bufferedReader, board, "X");
    }

    @Test
    public void shouldUpdateTheBoardWhenThePlayerMakesAMove() throws IOException {
        when(bufferedReader.readLine()).thenReturn("5");

        player.makeMove();

        verify(board).updateBoard("5", "X");
    }

    @Test
    public void shouldDisplayTheBoardWhenThePlayerMakesAMove() throws IOException {
        when(bufferedReader.readLine()).thenReturn("5");

        player.makeMove();

        verify(board).displayBoard();
    }
}