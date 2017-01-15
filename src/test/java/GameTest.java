import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by sspecht on 1/13/17.
 */

public class GameTest {
    private Board board;
    private Game game;
    private HashMap<String, Player> players;
    private Player player;

    @Before
    public void setup() {
        board = mock(Board.class);
        players = mock(HashMap.class);
        player = mock(Player.class);
        game = new Game(board, players);
    }

    @Test
    public void shouldDisplayBoardWhenGameStarts() {
        when(players.get("playerX")).thenReturn(player);

        game.run();

        verify(board).displayBoard();
    }

    @Test
    public void shouldMakeAPlayerMove() {
        when(players.get("playerX")).thenReturn(player);

        game.run();

        verify(player).makeMove();
    }
}