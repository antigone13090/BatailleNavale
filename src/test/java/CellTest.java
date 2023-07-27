package test.java;

import main.java.Cell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    private Cell cell;
    private Ship ship;

    @BeforeEach
    public void setup() {
        cell = new Cell();
        ship = new Ship(5, "Battleship");
    }

    @Test
    public void testInitialCell() {
        assertFalse(cell.hasBeenShot());
        assertNull(cell.getShip());
        assertFalse(cell.hasShip());
    }

    @Test
    public void testSetShip() {
        cell.setShip(ship);
        assertEquals(ship, cell.getShip());
        assertTrue(cell.hasShip());
    }

    @Test
    public void testTakeAShotNoShip() {
        assertEquals(ShotResult.MISS, cell.takeAShot());
        assertTrue(cell.hasBeenShot());
    }

    @Test
    public void testTakeAShotWithShip() {
        cell.setShip(ship);
        assertEquals(ShotResult.HIT, cell.takeAShot());
        assertTrue(cell.hasBeenShot());
    }

    @Test
    public void testTakeAShotWithShipAndSink() {
        ship = new Ship(1, "Small ship");
        cell.setShip(ship);
        assertEquals(ShotResult.SUNK, cell.takeAShot());
        assertTrue(cell.hasBeenShot());
        assertTrue(ship.hasBeenSunk());
    }
}
