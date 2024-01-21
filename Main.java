import packages.Game; // Importing the Game package
import packages.Grid; // Importing the Grid package

public class Main {
    public static void main(String[] args) {
        // Initiate game
        Grid.initiateGrid(); // Calling the initiateGrid() method from the Grid class to initialize the game grid
        
        Game.gameRunning(); // Calling the gameRunning() method from the Game class to start the game
    }
}
