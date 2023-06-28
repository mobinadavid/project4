package ir.ac.kntu.GameObject.wall;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class ColumnBrickWall extends BrickWall{
    public ColumnBrickWall(double xPos, double yPos, int health) {
        super(xPos, yPos, health);
    }
    public void draw(GraphicsContext gc) {
        image = new Image("file:object_16.png");
        gc.drawImage(getImage(), getxPos(), getyPos(), 20, 76);
    }

    public static Image image;

    public static Image getImage() {
        return image;
    }
}
