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
        player = new Player(printStream, bufferedReader, board, "X");
    }

    @Test
    public void shouldPromptThePlayerToChooseAPosition() throws IOException {
        player.makeMove();

        verify(printStream).println("Please pick a number to make a move.\n");

    }

    @Test
    public void shouldUpdateTheBoardWhenThePlayerMakesAMoveOnAValidPosition() throws IOException {
        when(bufferedReader.readLine()).thenReturn("5");

        player.makeMove();

        verify(board).updateBoard("5", "X");
    }

    @Test
    public void shouldDisplayTheBoardWhenThePlayerMakesAMoveOnAValidPosition() throws IOException {
        when(bufferedReader.readLine()).thenReturn("5");

        player.makeMove();

        verify(board).displayBoard();
    }

    @Test
    public void shouldCheckTheBoardForPositionVacancy() throws InputException, IOException {
        when(bufferedReader.readLine()).thenReturn("5");

        player.makeMove();

        verify(board).checkForPositionVacancy("5");
    }
}