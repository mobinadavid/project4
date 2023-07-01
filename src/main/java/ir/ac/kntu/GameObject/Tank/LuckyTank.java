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
        if (this.getScore()==100) {
            switch (getDirection()) {
                case UP -> image = new Image("file:object_234.png");
                case DOWN -> image = new Image("file:object_237.png");
                case LEFT -> image = new Image("file:object_235.png");
                case RIGHT -> image = new Image("file:object_239.png");
            }
        }
        if(this.getScore()==200){
        switch (getDirection()) {
            case UP -> image = new Image("file:object_259.png");
            case DOWN -> image = new Image("file:object_262.png");
            case LEFT -> image = new Image("file:object_261.png");
            case RIGHT -> image = new Image("file:object_264.png");
        }
        }
        gc.drawImage(getImage(), getxPos(), getyPos(), 36, 36);
    }
    }

