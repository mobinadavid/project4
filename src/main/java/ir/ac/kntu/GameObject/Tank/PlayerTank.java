package ir.ac.kntu.GameObject.Tank;

import ir.ac.kntu.Constants.Direction;
import ir.ac.kntu.Constants.GlobalConstants;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.io.File;

public class PlayerTank extends Tank{
    public  static Image image;

    public PlayerTank(double xPos, double yPos, int health, Direction direction, int firePower) {
        super(xPos, yPos, health, direction, firePower);
    }

    @Override
    public void draw(GraphicsContext gc) {
        System.out.println(getDirection());
        switch (getDirection()) {
            case UP -> image =new Image("file:object_1.png");
            case DOWN -> image =new Image ("file:object_4.png");
            case LEFT -> image =new Image("file:object_2.png");
            case RIGHT -> image =new Image("file:object_6.png");
        }
        gc.drawImage(getImage(),getxPos(),getyPos(),36,36);
    }
    public void move(int step,Direction direction){
        setDirection(direction);
        switch (direction){
            case RIGHT -> setxPos(getxPos()+step);
            case LEFT -> setxPos(getxPos()-step);
            case UP -> setyPos(getyPos()-step);
            case DOWN -> setyPos(getyPos()+step);

        }
        if(getxPos()<0){
            setxPos(0);
        }
        if(getxPos()+36>GlobalConstants.CANVAS_HEIGHT){
            setxPos(GlobalConstants.CANVAS_WIDTH-36);
        }
        if(getyPos()+36>GlobalConstants.CANVAS_HEIGHT){
            setyPos(GlobalConstants.CANVAS_HEIGHT-36);
        }
        if(getyPos()<0){
            setyPos(0);
        }
    }

    public static Image getImage() {
        return image;
    }
}
