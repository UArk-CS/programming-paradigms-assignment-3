// Benjamin A. Worthington
// September 9th, 2021
// CSCE 3193 Assignment 3 (imported from Assignment 2)
// Model.java

// Import Statements
import java.util.ArrayList;

public class Model {

    // Declare ArrayList of Brick objects
    ArrayList<Brick> bricks;

    // Declare private member variables
    private int cameraPos;

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

    public int getCameraPos() {
        return cameraPos;
    }

    public void setCameraPosLeft(int cameraPos) {
        this.cameraPos -= cameraPos;
    }

    public void setCameraPosRight(int cameraPos) {
        this.cameraPos += cameraPos;
    }

    // Create new Brick object and add it to Brick ArrayList
    public void createBrick(int x, int y, int w, int h) {

        Brick brick = new Brick(x, y, w, h);
        bricks.add(brick);

    }
    // Update method
    public void update() {}
}

