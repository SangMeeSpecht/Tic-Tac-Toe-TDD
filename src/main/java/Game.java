/**
 * Created by sspecht on 1/13/17.
 */
public class Game {
    Board board;
    GamePrompter gamePrompter;

    public Game(Board board, GamePrompter gamePrompter) {
        this.board = board;
        this.gamePrompter = gamePrompter;
    }


    public void start() {
        board.displayBoard();
        gamePrompter.displayNumberPrompt();
    }
}
