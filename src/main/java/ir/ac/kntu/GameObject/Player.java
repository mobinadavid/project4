package ir.ac.kntu.GameObject;

import ir.ac.kntu.Game;
import ir.ac.kntu.GameObject.Tank.ArmoredTank;
import ir.ac.kntu.GameObject.Tank.LuckyTank;
import ir.ac.kntu.GameObject.Tank.NormalTank;
import ir.ac.kntu.GameObject.Tank.Tank;
import ir.ac.kntu.GameObject.wall.BrickWall;
import ir.ac.kntu.GameObject.wall.ColumnBrickWall;
import ir.ac.kntu.GameObject.wall.MetalWall;
import ir.ac.kntu.GameObject.wall.Wall;
import jdk.jfr.Label;

public class Player {


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
                if (gameObject instanceof ColumnBrickWall) {
                    if (xTank > ((BrickWall) gameObject).getxPos() - 34 && xTank < ((BrickWall) gameObject).getxPos() + 34
                            && yTank > ((BrickWall) gameObject).getyPos() - 34 && yTank < ((BrickWall) gameObject).getyPos() + 44) {
                        return false;
                    }
                }
                if (gameObject instanceof NormalTank) {
                    if (xTank > ((NormalTank) gameObject).getxPos() - 34 && xTank < ((NormalTank) gameObject).getxPos() + 34 &&
                            yTank > ((NormalTank) gameObject).getyPos() - 34 && yTank < ((NormalTank) gameObject).getyPos() + 34) {
                        return false;
                    }
                }
                if (gameObject instanceof MetalWall) {
                    if (xTank > ((MetalWall) gameObject).getxPos() - 34 && xTank < ((MetalWall) gameObject).getxPos() + 34
                            && yTank > ((MetalWall) gameObject).getyPos() - 34 && yTank < ((MetalWall) gameObject).getyPos() + 34) {
                        return false;
                    }
                }
                if (gameObject instanceof ArmoredTank) {
                    if (xTank > ((ArmoredTank) gameObject).getxPos() - 34 && xTank < ((ArmoredTank) gameObject).getxPos() + 34
                            && yTank > ((ArmoredTank) gameObject).getyPos() - 34 && yTank < ((ArmoredTank) gameObject).getyPos() + 34) {
                        return false;
                    }
                }
                if (gameObject instanceof LuckyTank) {
                    if (xTank > ((LuckyTank) gameObject).getxPos() - 34 && xTank < ((LuckyTank) gameObject).getxPos() + 34
                            && yTank > ((LuckyTank) gameObject).getyPos() - 34 && yTank < ((LuckyTank) gameObject).getyPos() + 34) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
