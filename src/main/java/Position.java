package main.java;

public class Position {

    private Ship ship;
    private Coordinates firstCellCoordinates;
    private Orientation orientation;

    public Position(Ship ship, Coordinates firstCellCoordinates, Orientation orientation) {
        this.ship = ship;
        this.firstCellCoordinates = firstCellCoordinates;
        this.orientation = orientation;
    }

    public Coordinates[] shipCoordinates() {
        int length = ship.getLength();
        Coordinates[] coordinates = new Coordinates[length];

        for (int i = 0; i < length; i++) {
            if (orientation == Orientation.HORIZONTAL) {
                coordinates[i] = new Coordinates(firstCellCoordinates.getX() + i, firstCellCoordinates.getY());
            } else {
                coordinates[i] = new Coordinates(firstCellCoordinates.getX(), firstCellCoordinates.getY() + i);
            }
        }
        return coordinates;
    }
}
