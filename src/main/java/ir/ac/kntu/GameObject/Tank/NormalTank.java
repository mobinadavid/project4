package ir.ac.kntu.GameObject.Tank;

import ir.ac.kntu.Constants.Direction;
import ir.ac.kntu.Constants.GlobalConstants;
import ir.ac.kntu.Game;
import ir.ac.kntu.GameObject.GameObject;
import ir.ac.kntu.GameObject.wall.BrickWall;
import ir.ac.kntu.GameObject.wall.MetalWall;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.io.File;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class NormalTank extends Tank {
    Timer timer = new Timer();

    public NormalTank(double xPos, double yPos, int health, Direction direction, int firePower, int score) {
        super(xPos, yPos, health, direction, firePower, score);
        timer.schedule(new asd(), 0, 1000);
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

    public void randomWay() {
        Random random = new Random();
        int rand = random.nextInt(4);
        if (rand == 0) {
            this.setDirection(Direction.RIGHT);
        }
        if (rand == 1) {
            this.setDirection(Direction.LEFT);
        }
        if (rand == 3) {
            this.setDirection(Direction.DOWN);
        }
        if (rand == 2) {
            this.setDirection(Direction.UP);
        }

    }

    class asd extends TimerTask {

        @Override
        public void run() {
            randomWay();
        }
    }

    public void move(int step, Direction direction) {
        setDirection(direction);
        if (isCollided(this)) {
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

    public static boolean isCollided(Tank tank) {
        int xTank = (int) tank.getxPos();
        int yTank = (int) tank.getyPos();
        switch (tank.getDirection()) {
            case RIGHT -> xTank += 5;
            case LEFT -> xTank -= 5;
            case UP -> yTank -= 5;
            case DOWN -> yTank += 5;

        }
        for (GameObject gameObject : Game.gameObjects) {
            if (!gameObject.equals(tank)) {
                if (gameObject instanceof BrickWall) {
                    if (xTank > ((BrickWall) gameObject).getxPos() - 34 && xTank < ((BrickWall) gameObject).getxPos() + 34
                            && yTank > ((BrickWall) gameObject).getyPos() - 34 && yTank < ((BrickWall) gameObject).getyPos() + 34) {
                        return false;
                    }
                }
                if (gameObject instanceof MetalWall) {
                    if (xTank > ((MetalWall) gameObject).getxPos() - 34 && xTank < ((MetalWall) gameObject).getxPos() + 34
                            && yTank > ((MetalWall) gameObject).getyPos() - 34 && yTank < ((MetalWall) gameObject).getyPos() + 34) {
                        return false;
                    }
                }
                if (gameObject instanceof PlayerTank) {
                    if (xTank > ((PlayerTank) gameObject).getxPos() - 34 && xTank < ((PlayerTank) gameObject).getxPos() + 34
                            && yTank > ((PlayerTank) gameObject).getyPos() - 34 && yTank < ((PlayerTank) gameObject).getyPos() + 34) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

}
