package main.java;

/**
 * The BattleShipApp class is responsible for starting the BattleShip game.
 */
public class BattleShipApp {

    /**
     * The main method of the application, which is the entry point for the Java application.
     *
     * @param args An array of command-line arguments for the application
     */
    public static void main(String[] args) {
        // Create a new grid with width and height of 10
        Grid grid = new Grid(10, 10);

        // Create a new game using the grid
        BattleShipGame game = new BattleShipGame(grid);

        // Play the game
        game.playGame();
    }
}
