import java.util.HashMap;

/**
 * Created by sspecht on 1/13/17.
 */

public class Game {
    Board board;
    HashMap<String, Player> players;

    public Game(Board board, HashMap<String, Player> players) {
        this.board = board;
        this.players = players;
    }

    public void run() {
        board.displayBoard();
        players.get("playerX").makeMove();
    }
}
