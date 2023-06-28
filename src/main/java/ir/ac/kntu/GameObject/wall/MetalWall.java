package ir.ac.kntu.GameObject.wall;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class MetalWall extends Wall {
    public MetalWall(double xPos, double yPos, int health) {
        super(xPos, yPos, health);
    }


    public void draw(GraphicsContext gc) {
        image = new Image("file:object_41.png");
        gc.drawImage(getImage(), getxPos(), getyPos(), 36, 36);
    }

    public static Image image;

    public static Image getImage() {
        return image;
    }
}
