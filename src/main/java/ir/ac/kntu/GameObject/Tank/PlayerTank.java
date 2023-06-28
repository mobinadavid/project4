package ir.ac.kntu.GameObject.Tank;

import ir.ac.kntu.Constants.Direction;
import ir.ac.kntu.Constants.GlobalConstants;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.io.File;

public class PlayerTank extends Tank{
    public PlayerTank(double xPos, double yPos, int health, Direction direction, int firePower) {
        super(xPos, yPos, health, direction, firePower);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.drawImage(imageLoader(),getxPos(),getyPos(),35,35);
    }
    public Image imageLoader() {
        String address = null;
        switch (getDirection()) {
            case UP -> address = "object_1.png";
            case DOWN -> address = "object_4.png";
            case LEFT -> address = "object_2.png";
            case RIGHT -> address = "object_6.png";
        }
        File file=new File(address);
        String address2=file.toURI().toString();
        return  new javafx.scene.image.Image(address2);
    }
    public void move(int step,Direction direction){
        switch (direction){
            case RIGHT -> setxPos(getxPos()+step);
            case LEFT -> setxPos(getyPos()-step);
            case UP -> setyPos(getyPos()-step);
            case DOWN -> setyPos(getyPos()+step);

        }
        if(getxPos()-36/2<0){
            setxPos(36/2);
        }
        if(getxPos()+36/2>GlobalConstants.CANVAS_WIDTH){
            setxPos(GlobalConstants.CANVAS_WIDTH-18);
        }
        if(getyPos()+18>GlobalConstants.CANVAS_HEIGHT){
            setyPos(GlobalConstants.CANVAS_HEIGHT-18);
        }
        if(getyPos()-18<0){
            setyPos(18);
        }
    }
}
