package ir.ac.kntu.GameObject.Tank;

import ir.ac.kntu.Constants.Direction;
import ir.ac.kntu.Constants.GlobalConstants;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.io.File;

public class NormalTank extends Tank {
    public NormalTank(double xPos, double yPos, int health, Direction direction, int firePower) {
        super(xPos, yPos, health, direction, firePower);
    }

    public static Image image;

    public static Image getImage() {
        return image;
    }

    @Override
    public void draw(GraphicsContext gc) {
        switch (getDirection()) {
            case UP -> image = new Image("file:object_8.png");
            case DOWN -> image = new Image("file:object_12.png");
            case LEFT -> image = new Image("file:object_10.png");
            case RIGHT -> image = new Image("file:object_14.png");
        }
        gc.drawImage(getImage(), getxPos(), getyPos(), 36, 36);
    }
    public void move(int step, Direction direction) {
        setDirection(direction);
        switch (direction) {
            case RIGHT -> setxPos(getxPos() + step);
            case LEFT -> setxPos(getxPos() - step);
            case UP -> setyPos(getyPos() - step);
            case DOWN -> setyPos(getyPos() + step);

        }
        if (getxPos() < 0) {
            setxPos(0);
        }
        if (getxPos() + 36 > GlobalConstants.CANVAS_HEIGHT) {
            setxPos(GlobalConstants.CANVAS_WIDTH - 36);
        }
        if (getyPos() + 36 > GlobalConstants.CANVAS_HEIGHT) {
            setyPos(GlobalConstants.CANVAS_HEIGHT - 36);
        }
        if (getyPos() < 0) {
            setyPos(0);
        }
    }

}
