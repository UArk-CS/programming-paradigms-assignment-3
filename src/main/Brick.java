// Benjamin A. Worthington
// September 18th, 2021
// CSCE 3193 Assignment 3 - A simple map editor where the user can
// draw bricks and scroll left and right
// Brick.java

public class Brick {

    // Declare member variables
    private int xPos;
    private int yPos;
    private int width;
    private int height;

    // Constructor
    Brick(int x, int y, int w, int h) {

        this.xPos = x;
        this.yPos = y;
        this.width = w;
        this.height = h;

    }

    // Brick Marshal Constructor
    Brick(Json obj) {

        this.xPos = (int)obj.getLong("xPos");
        this.yPos = (int)obj.getLong("yPos");
        this.width = (int)obj.getLong("width");
        this.height = (int)obj.getLong("height");

    }

    // Getter and Setter methods
    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Json Marshal method
    Json marshal() {

        Json obj = Json.newObject();

        obj.add("xPos", xPos);
        obj.add("yPos", yPos);
        obj.add("width", width);
        obj.add("height", height);

        return obj;

    }

}
