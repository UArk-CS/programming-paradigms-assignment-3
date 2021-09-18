// Benjamin A. Worthington
// September 9th, 2021
// CSCE 3193 Assignment 3 (imported from Assignment 2)
// View.java

// Import statements
import javax.swing.*;
import java.awt.*;

class View extends JPanel {

    // Declaring member variables
    Model model;

    // View constructor
    View(Controller c, Model m) {

        // Set member variable to object reference
        model = m;

        // Tell the controller what view to use
        c.setView(this);

    }

    public void paintComponent(Graphics g) {}

}
