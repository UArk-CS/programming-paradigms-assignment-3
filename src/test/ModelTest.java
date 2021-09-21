// Benjamin A. Worthington
// September 18th, 2021
// JUnit test for Model.java
// ModelTest.java

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {

    // Declare object reference
    Model model;

    // Declare member variables
    Brick b1;
    Brick b2;
    Brick b3;

    @Before
    public void setUp() {

        // Instantiate model reference
        model = new Model();

        // Instantiate three Brick objects
        b1 = new Brick(0, 0, 100, 50);
        b2 = new Brick(100, 0, 100, 50);
        b3 = new Brick(200, 0, 100, 50);

        // Add Bricks to ArrayList
        model.addBrick(b1);
        model.addBrick(b2);
        model.addBrick(b3);

    }

    // 1. Does Brick obj get successfully added to arraylist?
    @Test
    public void isSuccessfullyAddedToArrayList() {

        assertFalse(model.getBricks().isEmpty());

    }

    // 2. Does the brick obj get saved with the correct values?
    @Test
    public void hasCorrectValues() {

        assertEquals(model.getBricks().get(1).getxPos(), b2.getxPos());
        assertEquals(model.getBricks().get(1).getyPos(), b2.getyPos());
        assertEquals(model.getBricks().get(1).getWidth(), b2.getWidth());
        assertEquals(model.getBricks().get(1).getHeight(), b2.getHeight());

    }

    // 3. Does the get method get the correct object in the arraylist?
    @Test
    public void doesGetBricksWork() {
        
        assertEquals(model.getBricks().get(0), b1);
        
    }

}