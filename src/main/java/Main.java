import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;

/**
 * Created by sspecht on 1/13/17.
 */

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Board board = new Board(printStream);

        HashMap<String, Player> players = new HashMap<String, Player>();
        players.put("playerX", new Player(printStream, bufferedReader, board, "X"));
        players.put("playerO", new Player(printStream, bufferedReader, board, "O"));
        Game game = new Game(board, players);

        game.run();
    }

}
