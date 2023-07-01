package ir.ac.kntu.GameObject.Tank;

import ir.ac.kntu.Constants.Direction;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class LuckyTank extends Tank {
    public LuckyTank(double xPos, double yPos, int health, Direction direction, int firePower, int score) {
        super(xPos, yPos, health, direction, firePower, score);
    }

    public static Image image;

    public static Image getImage() {
        return image;
    }

    @Override
    public void draw(GraphicsContext gc) {

    }
}
