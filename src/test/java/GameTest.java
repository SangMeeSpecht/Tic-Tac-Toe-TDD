import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by sspecht on 1/13/17.
 */
public class GameTest {
    private Board board;
    private GamePrompter gamePrompter;
    private Game game;

    @Before
    public void setup() {
        board = mock(Board.class);
        gamePrompter = mock(GamePrompter.class);
        game = new Game(board, gamePrompter);
    }

    @Test
    public void shouldDisplayBoardWhenGameStarts() {
        game.start();

        verify(board).displayBoard();
    }

    @Test
    public void shouldAskUserToSelectNumberToChooseBoardPosition() {
        game.start();

        verify(gamePrompter).displayNumberPrompt();
    }
}