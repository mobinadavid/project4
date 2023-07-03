package ir.ac.kntu.GameObject;

import ir.ac.kntu.Constants.GlobalConstants;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Tree extends GameObject {
    private double xPos;

    private double yPos;

    public Tree(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void draw(GraphicsContext gc) {
        image = new Image("file:object_67.png");

        gc.drawImage(getImage(), getxPos(), getyPos(), GlobalConstants.ICON_WIDTH, GlobalConstants.ICON_HEIGHT);

    }

    public static Image image;

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

    public static void setImage(Image image) {
        Tree.image = image;
    }

    public static Image getImage() {
        return image;
    }
}
