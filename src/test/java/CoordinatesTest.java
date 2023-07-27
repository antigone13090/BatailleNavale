package test.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinatesTest {

    @Test
    public void testGetX() {
        Coordinates c = new Coordinates(3, 4);
        assertEquals(3, c.getX());
    }

    @Test
    public void testGetY() {
        Coordinates c = new Coordinates(3, 4);
        assertEquals(4, c.getY());
    }

    @Test
    public void testEquals() {
        Coordinates c1 = new Coordinates(5, 6);
        Coordinates c2 = new Coordinates(5, 6);
        Coordinates c3 = new Coordinates(5, 7);

        assertEquals(c1, c2);
        assertNotEquals(c1, c3);
    }

    @Test
    public void testToString() {
        Coordinates c = new Coordinates(2, 7);
        assertEquals("(2, 7)", c.toString());
    }

    @Test
    public void testAdd() {
        Coordinates c1 = new Coordinates(2, 3);
        Coordinates c2 = new Coordinates(4, 5);
        Coordinates result = c1.add(c2);

        assertEquals(new Coordinates(6, 8), result);
    }
}
