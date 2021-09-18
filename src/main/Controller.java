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
    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}

    // Key Event methods
    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

}
