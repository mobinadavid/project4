package ir.ac.kntu.GameObject.wall;

import ir.ac.kntu.GameObject.GameObject;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Flag extends GameObject {
    private double xPos;
    private double yPos;

    public Flag(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public double getxPos() {
        return xPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }

    public void draw(GraphicsContext gc) {
        image = new Image("file:object_69.png");
        gc.drawImage(getImage(), getxPos(), getyPos(), 30, 40);
    }

    public static Image image;

    public static Image getImage() {
        return image;
    }

}
