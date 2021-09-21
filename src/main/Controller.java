// Benjamin A. Worthington
// September 9th, 2021
// CSCE 3193 Assignment 3 (imported from Assignment 2)
// Controller.java

// Import statements
import java.awt.event.*;

class Controller implements MouseListener, KeyListener {

    // Declaring member variables for object references
    View view;
    Model model;

    // Declaring private member variables to hold temp xPos and yPos
    private int tempXPos;
    private int tempYPos;
    private int tempFinalXPos;
    private int tempFinalYPos;
    private int tempWidth;
    private int tempHeight;

    // Controller constructor
    Controller(Model m) {
        model = m;
    }

    // Setter method for view
    void setView(View v) {
        view = v;
    }

    void update() {}

    // Mouse Event methods
    public void mousePressed(MouseEvent e) {

        // Get x and y coordinates where mouse is pressed
        tempXPos = e.getX();
        tempYPos = e.getY();

    }

    public void mouseReleased(MouseEvent e) {

        // Get x and y coordinates where mouse is released
        tempFinalXPos = e.getX();
        tempFinalYPos = e.getY();

        // Calculate width and height
        tempWidth = tempFinalXPos - tempXPos;
        tempHeight = tempFinalYPos - tempYPos;

        // Get the absolute value of the width and height
        tempWidth = Math.abs(tempWidth);
        tempHeight = Math.abs(tempHeight);

        // Flip the x and y coordinates if box is drawn instead of top left corner to bottom right corner
        if (tempXPos > tempFinalXPos) {
            tempXPos = tempFinalXPos;
        }

        if (tempYPos > tempFinalYPos) {
            tempYPos = tempFinalYPos;
        }

        // Create new Brick object with proper values
        model.createBrick(tempXPos, tempYPos, tempWidth, tempHeight);

    }

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    // Key Event methods
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {

            // If escape key is pressed, exit the program
            case KeyEvent.VK_ESCAPE:
                System.exit(0);
                break;

        }

    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

}
