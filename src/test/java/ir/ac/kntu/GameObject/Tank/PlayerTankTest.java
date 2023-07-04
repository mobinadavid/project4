package ir.ac.kntu.GameObject.Tank;

import ir.ac.kntu.Constants.Direction;
import junit.framework.TestCase;

public class PlayerTankTest extends TestCase {

    public void testGetXAndY() {
        PlayerTank playerTank = new PlayerTank(100, 300, 1, Direction.UP, 1, 100);
        assertEquals(100.0, playerTank.getxPos());
        assertEquals(300.0, playerTank.getyPos());

    }

    public void testGetScore() {
        PlayerTank playerTank = new PlayerTank(100, 300, 1, Direction.UP, 1, 100);
        assertEquals(100, playerTank.getScore());
    }

    public void testDirection() {
        PlayerTank playerTank = new PlayerTank(100, 300, 1, Direction.RIGHT, 1, 100);
        assertEquals(Direction.RIGHT, playerTank.getDirection());
    }
}