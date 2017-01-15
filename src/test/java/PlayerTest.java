import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * Created by sspecht on 1/14/17.
 */

public class PlayerTest {
    private Player player;
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;
    private InputException inputException;

    @Before
    public void setup() {
        bufferedReader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        inputException = new InputException(printStream);
        player = new Player(printStream, bufferedReader, board, "X", inputException);
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

    @Test(expected = InputException.class)
    public void shouldDisplayErrorMessageWhenPositionIsAlreadyTaken() {
        doThrow(inputException).when(player).makeMove();

        player.makeMove();
    }

}