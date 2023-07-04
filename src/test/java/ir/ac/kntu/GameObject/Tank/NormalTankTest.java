package ir.ac.kntu.GameObject.Tank;

import ir.ac.kntu.Constants.Direction;
import junit.framework.TestCase;
import org.junit.Test;

public class NormalTankTest extends TestCase {
    @Test
    public void testxAndY() {
        NormalTank normalTank = new NormalTank(100, 200, 1, Direction.DOWN, 1, 100);
        assertEquals(100.0, normalTank.getxPos());
        assertEquals(100.0, normalTank.getyPos());

    }

    public void test() {
        NormalTank normalTank = new NormalTank(100, 100, 1, Direction.DOWN, 1, 100);
        assertEquals(Direction.DOWN, normalTank.getDirection());
    }
}