package main.java;

public class Grid {

    // Attributes
    private int width;
    private int height;
    private Cell[][] cells;

    // Constructor
    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.cells = new Cell[height][width];  // Initialize the grid with cells

        // Initialize each cell in the grid
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                this.cells[i][j] = new Cell();
            }
        }
    }

    // Getters
    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    // Additional methods
    public Cell getCell(Coordinates coordinates) {
        return this.cells[coordinates.getY()][coordinates.getX()];
    }

    public boolean contains(Coordinates coordinates) {
        int x = coordinates.getX();
        int y = coordinates.getY();
        return x >= 0 && x < this.width && y >= 0 && y < this.height;
    }

    // Remaining methods need to be implemented, as their behaviour depends on the game logic
    // Here are their skeletons

    public ShotResult shootAt(Coordinates coordinates) {
        // implement the logic for shooting at a specific cell in the grid
        // this logic might involve checking if a ship is present and updating the cell status
    }

    public boolean hasShipAt(Coordinates coordinates) {
        // implement the logic for checking if a ship exists at a specific cell in the grid
    }

    public boolean hasBeenShotAt(Coordinates coordinates) {
        // implement the logic for checking if a specific cell in the grid has been shot at
    }

    public void putShip(Ship ship, Coordinates firstCell, Orientation orientation) {
        // implement the logic for placing a ship on the grid
        // this logic might involve updating multiple cells based on the ship size and orientation
    }

    public boolean isCompleted() {
        // implement the logic for checking if the grid is completed, i.e., all ships have been placed
    }
}
