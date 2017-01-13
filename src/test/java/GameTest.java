import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by sspecht on 1/13/17.
 */
public class GameTest {

    @Test
    @Ignore
    public void shouldDisplayBoardWhenGameStarts() {
        Board board = mock(Board.class);
        Game game = new Game(board);

        game.start();

        verify(board).displayBoard();
    }
}