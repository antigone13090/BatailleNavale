package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ShipTest {
    @Test
    public void testTakeAHit() {
        Ship ship = new Ship(3, "Battleship");
        ship.takeAHit();
        assertEquals(2, ship.getLifePoints());
    }

    @Test
    public void testHasBeenSunk() {
        Ship ship = new Ship(1, "Battleship");
        ship.takeAHit();
        assertTrue(ship.hasBeenSunk());
    }
}
