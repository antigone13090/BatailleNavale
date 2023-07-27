package main.java;

import main.java.GridPrinter;

import java.util.Scanner;

public class BattleShipGame {
    private int turnCount;
    private GridPrinter gridPrinter;
    private Grid grid;
    private Scanner scanner;

    public BattleShipGame(Grid grid) {
        this.grid = grid;
        this.gridPrinter = new GridPrinter(grid);
        this.scanner = new Scanner(System.in);
        this.turnCount = 0;
    }

    public void playGame() {
        while (!grid.isCompleted()) {
            playTurn();
        }
        printWinningMessage();
    }

    private void playTurn() {
        printTurnNumberMessage();
        gridPrinter.printGrid();

        System.out.println("Enter coordinates to shoot at in the format 'x,y':");
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);

        grid.shootAt(new Coordinates(x, y));
        turnCount++;
    }

    private void printWinningMessage() {
        System.out.println("Congratulations, you've completed the game in " + turnCount + " turns!");
    }

    private void printTurnNumberMessage() {
        System.out.println("Turn " + (turnCount + 1) + ":");
    }
}
