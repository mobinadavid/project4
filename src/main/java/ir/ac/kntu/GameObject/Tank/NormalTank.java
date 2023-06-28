package ir.ac.kntu.GameObject.Tank;

import ir.ac.kntu.Constants.Direction;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.io.File;

public class NormalTank extends Tank {
    public NormalTank(double xPos, double yPos, int health, Direction direction, int firePower) {
        super(xPos, yPos, health, direction, firePower);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.clearRect(0,0,800,800);
        gc.drawImage(imageLoader(),getxPos(),getyPos(),36,36);
    }

    public Image imageLoader() {
        String address = null;
        switch (getDirection()) {
            case UP -> address = "object_8.png";
            case DOWN -> address = "object_12.png";
            case LEFT -> address = "object_10.png";
            case RIGHT -> address = "object_14.png";
        }
        File file=new File(address);
        String address2=file.toURI().toString();
        return  new javafx.scene.image.Image(address2);

    }
}
