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
    }

    // Getter and Setter methods
    public ArrayList<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(ArrayList<Brick> bricks) {
        this.bricks = bricks;
    }

    // Add Brick object to ArrayList
    public void addBrick(Brick b) {
        this.bricks.add(b);
    }

    // Update method
    public void update() {}

}

