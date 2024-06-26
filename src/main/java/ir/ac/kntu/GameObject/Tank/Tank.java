package ir.ac.kntu.GameObject.Tank;

import ir.ac.kntu.Constants.Direction;
import ir.ac.kntu.GameObject.GameObject;
import javafx.scene.canvas.GraphicsContext;

import javax.swing.text.html.ImageView;

public abstract class Tank extends GameObject {
    private double xPos;

    private double yPos;

    private int health;

    private Direction direction;

    private int firePower;

    private ImageView imageTank;

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Tank(double xPos, double yPos, int health, Direction direction, int firePower, int score) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.health = health;
        this.direction = direction;
        this.firePower = firePower;
        this.score = score;
    }

    public abstract void draw(GraphicsContext gc);


    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getFirePower() {
        return firePower;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }

    public ImageView getImageTank() {
        return imageTank;
    }

    public void setImageTank(ImageView imageTank) {
        this.imageTank = imageTank;
    }

    public double getxPos() {
        return xPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
