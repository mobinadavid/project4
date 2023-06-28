package ir.ac.kntu.GameObject.wall;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class BrickWall extends Wall{
    public BrickWall(double xPos, double yPos, int health) {
        super(xPos, yPos, health);
    }
    public void draw(GraphicsContext gc) {
        image = new Image("file:object_16.png");
        gc.drawImage(getImage(), getxPos(), getyPos(), 36, 36);
    }

    public static Image image;

    public static Image getImage() {
        return image;
    }


}
