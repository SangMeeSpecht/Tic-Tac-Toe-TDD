import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.*;

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

        when(players.get("playerX")).thenReturn(player);
        when(players.get("playerO")).thenReturn(player);
    }

    @Test
    public void shouldDisplayBoardWhenGameStarts() {
        game.run();

        verify(board).displayBoard();
    }

//    not specific enough???
    @Test
    public void shouldMoveAPlayerWhenGameStarts() {
        game.run();

        verify(player, atLeastOnce()).makeMove();
    }
}