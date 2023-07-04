package ir.ac.kntu;

import junit.framework.TestCase;
import org.junit.Test;

public class GameStateTest extends TestCase {
    @Test
    public void testGmeState() {
        GameState gameState = new GameState();
        assertEquals(true, gameState.equals(gameState));
    }
}