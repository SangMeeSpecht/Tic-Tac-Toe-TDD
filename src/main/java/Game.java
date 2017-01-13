/**
 * Created by sspecht on 1/13/17.
 */
public class Game {
    Board board;

    public Game(Board board) {
        this.board = board;
    }


    public void run() {
        board.displayBoard();
        board.makeMove();
//        board.displayBoard();
    }
}
