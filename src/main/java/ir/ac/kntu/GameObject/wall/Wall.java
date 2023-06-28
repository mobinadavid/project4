package ir.ac.kntu.GameObject.wall;

import ir.ac.kntu.GameObject.GameObject;
import javafx.scene.canvas.GraphicsContext;

public class Wall extends GameObject {
    private double xPos;
    private double yPos;

    public Wall(double xPos, double yPos, int health) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.health = health;
    }


    private int health;

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
