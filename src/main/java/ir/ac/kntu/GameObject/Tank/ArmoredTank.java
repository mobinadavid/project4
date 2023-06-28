package ir.ac.kntu.GameObject.Tank;

import ir.ac.kntu.Constants.Direction;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.io.File;

public class ArmoredTank extends Tank{
    public ArmoredTank(double xPos, double yPos, int health, Direction direction, int firePower) {
        super(xPos, yPos, health, direction, firePower);
    }

    public void draw(GraphicsContext gc) {
        gc.drawImage(imageLoader(),getxPos(),getyPos(),36,36);
    }

    public Image imageLoader() {
        String address = null;
        switch (getDirection()) {
            case UP -> address = "object_34.png";
            case DOWN -> address = "object_37.png";
            case LEFT -> address = "object_36.png";
            case RIGHT -> address = "object_39.png";
        }
        File file=new File(address);
        String address2=file.toURI().toString();
        return  new javafx.scene.image.Image(address2);

    }
}
