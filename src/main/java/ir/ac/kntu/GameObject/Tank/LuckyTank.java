package ir.ac.kntu.GameObject.Tank;

import ir.ac.kntu.Constants.Direction;
import ir.ac.kntu.Constants.GlobalConstants;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class LuckyTank extends Tank {
    public LuckyTank(double xPos, double yPos, int health, Direction direction, int firePower, int score) {
        super(xPos, yPos, health, direction, firePower, score);
        timer.schedule(new RunTank(), 0, 1000);
    }

    Timer timer = new Timer();


    public static Image image;


    public static Image getImage() {
        return image;
    }

    public void randomWay() {
        Random random = new Random();
        int rand = random.nextInt(4);
        if (rand == 1) {
            this.setDirection(Direction.RIGHT);
        }
        if (rand == 3) {
            this.setDirection(Direction.LEFT);
        }
        if (rand == 0) {
            this.setDirection(Direction.DOWN);
        }
        if (rand == 2) {
            this.setDirection(Direction.UP);
        }

    }

    class RunTank extends TimerTask {

        @Override
        public void run() {
            randomWay();
        }
    }

    public void move(int step, Direction direction) {
        setDirection(direction);
        if (NormalTank.isCollided(this)) {
            switch (direction) {
                case RIGHT -> setxPos(getxPos() + step);
                case LEFT -> setxPos(getxPos() - step);
                case UP -> setyPos(getyPos() - step);
                case DOWN -> setyPos(getyPos() + step);
                default -> setyPos(getyPos() + step);

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

    @Override
    public void draw(GraphicsContext gc) {
        if (this.getScore() == 100) {
            switch (getDirection()) {
                case UP -> image = new Image("file:object_234.png");
                case DOWN -> image = new Image("file:object_237.png");
                case LEFT -> image = new Image("file:object_235.png");
                case RIGHT -> image = new Image("file:object_239.png");
                default -> image = new Image("file:object_239.png");
            }
        }
        if (this.getScore() == 200) {
            switch (getDirection()) {
                case UP -> image = new Image("file:object_259.png");
                case DOWN -> image = new Image("file:object_262.png");
                case LEFT -> image = new Image("file:object_261.png");
                case RIGHT -> image = new Image("file:object_264.png");
                default -> image = new Image("file:object_264.png");
            }
        }
        gc.drawImage(getImage(), getxPos(), getyPos(), 36, 36);
    }
}

