import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by sspecht on 1/13/17.
 */
public class GameTest {
    private Board board;
    private Game game;

    @Before
    public void setup() {
        board = mock(Board.class);
        game = new Game(board);
    }

    @Test
    public void shouldDisplayBoardWhenGameStarts() {
        game.run();

        verify(board).displayBoard();
    }

    @Test
    public void shouldMakeAPlayerMove() {
        game.run();

        verify(board).makeMove();
    }
}