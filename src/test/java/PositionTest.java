package test.java;

import org.junit.jupiter.api.Test;
import main.java.Orientation;

import static org.junit.jupiter.api.Assertions.*;

public class PositionTest {
    @Test
    public void testShipCoordinates() {
        Ship ship = new Ship(4, "Test Ship");
        Coordinates firstCellCoordinates = new Coordinates(1, 2);
        Position position1 = new Position(ship, firstCellCoordinates, Orientation.HORIZONTAL);

        Coordinates[] expected = {
                new Coordinates(1, 2),
                new Coordinates(2, 2),
                new Coordinates(3, 2),
                new Coordinates(4, 2)
        };

        assertArrayEquals(expected, position1.shipCoordinates());
    }

    @Test
    public void testVerticalShipCoordinates() {
        Ship ship = new Ship(5, "Test Ship");
        Coordinates firstCellCoordinates = new Coordinates(5, 4);
        Position position2 = new Position(ship, firstCellCoordinates, Orientation.VERTICAL);

        Coordinates[] expected = {
                new Coordinates(5, 4),
                new Coordinates(5, 5),
                new Coordinates(5, 6),
                new Coordinates(5, 7),
                new Coordinates(5, 8),
                new Coordinates(5, 9)
        };

        assertArrayEquals(expected, position2.shipCoordinates());
    }
}
