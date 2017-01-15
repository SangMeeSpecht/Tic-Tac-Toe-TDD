import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by sspecht on 1/15/17.
 */
public class InputExceptionTest {
    private PrintStream printStream;
    private InputException inputException;
    private Board board;

    @Before
    public void setup() {
        PrintStream printStream = mock(PrintStream.class);
        InputException inputException = new InputException(printStream);
        Board board = mock(Board.class);
    }

//    @Test(expected=InputException.class)
//    public void shouldThrowLocationTakenExceptionIfPositionHasAnX() throws InputException {
//        doThrow(inputException).when(board).checkForPositionVacancy("5");
//
//        verify(printStream).println("Location already taken.");
//    }
}