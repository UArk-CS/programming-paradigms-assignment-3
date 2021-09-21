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
    Color brickRed = new Color(203, 65, 84);

    // View constructor
    View(Controller c, Model m) {

        // Set member variable to object reference
        model = m;

        // Tell the controller what view to use
        c.setView(this);

    }

    public void paintComponent(Graphics g) {

        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        for (int i = 0; i < model.getBricks().size(); i++) {

            Brick temp = model.getBricks().get(i);
            g.setColor(brickRed);
            g.fillRect(temp.getxPos() - model.getCameraPos(), temp.getyPos(), temp.getWidth(), temp.getHeight());

        }

    }

}
