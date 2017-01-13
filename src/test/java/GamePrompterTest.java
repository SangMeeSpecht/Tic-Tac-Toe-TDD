import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by sspecht on 1/13/17.
 */
public class GamePrompterTest {

    @Test
    public void shouldPromptUserToEnterANumberToChooseBoardPosition() {
        PrintStream printStream = mock(PrintStream.class);
        GamePrompter gamePrompter = new GamePrompter(printStream);

        gamePrompter.displayNumberPrompt();

        verify(printStream).println("Please pick a number to make a move.");
    }
}