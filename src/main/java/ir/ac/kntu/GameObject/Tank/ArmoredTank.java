package ir.ac.kntu.GameObject.Tank;

import ir.ac.kntu.Constants.Direction;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.io.File;

public class ArmoredTank extends Tank {
    public ArmoredTank(double xPos, double yPos, int health, Direction direction, int firePower,int score) {
        super(xPos, yPos, health, direction, firePower,score);
    }

    public static Image image;

    public static Image getImage() {
        return image;
    }

    public void draw(GraphicsContext gc) {
        switch (getDirection()) {
            case UP -> image = new Image("file:object_34.png");
            case DOWN -> image = new Image("file:object_37.png");
            case LEFT -> image = new Image("file:object_36.png");
            case RIGHT -> image = new Image("file:object_39.png");
        }
        gc.drawImage(getImage(), getxPos(), getyPos(), 36, 36);
    }

}
