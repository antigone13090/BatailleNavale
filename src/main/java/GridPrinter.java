package main.java;



public class GridPrinter {
    // Define constants for various symbols
    public static final char HIT_CHARACTER = 'X';
    public static final char MISSED_CHARACTER = '-';
    public static final char BLANK_CHARACTER = ' ';

    private Grid grid;

    public GridPrinter(Grid grid) {
        this.grid = grid;
    }

    public void printGrid() {
        printCoordinatesRow();
        for (int i = 0; i < grid.getHeight(); i++) {
            printLine();
            printRow(i);
        }
        printLine();
    }

    private void printLine() {
        for (int i = 0; i <= grid.getWidth(); i++) {
            System.out.print("---");
        }
        System.out.println();
    }

    private void printRow(int row) {
        System.out.print(row + " |");
        for (int col = 0; col < grid.getWidth(); col++) {
            printCell(new Coordinates(col, row));
        }
        System.out.println("| " + row);
    }

    private void printSquare(char character) {
        System.out.print(" " + character + " ");
    }

    private void printCell(Coordinates coordinates) {
        Cell cell = grid.getCell(coordinates);
        if (cell.hasBeenShot()) {
            if (cell.hasShip()) {
                printSquare(HIT_CHARACTER);
            } else {
                printSquare(MISSED_CHARACTER);
            }
        } else {
            printSquare(BLANK_CHARACTER);
        }
    }

    private void printCoordinatesRow() {
        System.out.print("  ");
        for (int i = 0; i < grid.getWidth(); i++) {
            if (i < 10) {
                System.out.print(" " + i + " ");
            } else {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }
}
