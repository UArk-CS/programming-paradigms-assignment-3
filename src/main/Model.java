// Benjamin A. Worthington
// September 9th, 2021
// CSCE 3193 Assignment 3 (imported from Assignment 2)
// Model.java

// Import Statements
import java.util.ArrayList;

public class Model {

    // Declare ArrayList of Brick objects
    ArrayList<Brick> bricks;

    // Default constructor
    Model() {

        bricks = new ArrayList<>();

        // For UI testing purposes
//        Brick testBrick = new Brick(100, 100, 100, 50);
//        Brick testBrick2 = new Brick(225, 100, 100, 50);
//        bricks.add(testBrick);
//        bricks.add(testBrick2);

    }

    // Getter and Setter methods
    public ArrayList<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(ArrayList<Brick> bricks) {
        this.bricks = bricks;
    }

    // Create new Brick object and add it to Brick ArrayList
    public void createBrick(int x, int y, int w, int h) {

        Brick brick = new Brick(x, y, w, h);
        bricks.add(brick);

    }

    // Update method
    public void update() {}

}

