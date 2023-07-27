package test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GridTest {

    @Test
    public void testConstructor() {
        Grid grid = new Grid(10, 10);
        assertEquals(10, grid.getWidth());
        assertEquals(10, grid.getHeight());

        for (int i = 0; i < grid.getHeight(); i++) {
            for (int j = 0; j < grid.getWidth(); j++) {
                Coordinates coord = new Coordinates(j, i);
                assertNotNull(grid.getCell(coord));
            }
        }
    }

    @Test
    public void testContains() {
        Grid grid = new Grid(10, 10);
        assertTrue(grid.contains(new Coordinates(0, 0)));
        assertTrue(grid.contains(new Coordinates(9, 9)));
        assertFalse(grid.contains(new Coordinates(10, 10)));
        assertFalse(grid.contains(new Coordinates(-1, -1)));
    }

    // Write more tests for other methods such as shootAt, hasShipAt, hasBeenShotAt, putShip, and isCompleted.
    // Note that you would need to create stub/mock objects or real instances for some of these tests.
    // Consider using libraries like Mockito if you need to create complex mock objects.
}
