package ir.ac.kntu;

import ir.ac.kntu.Constants.Direction;
import ir.ac.kntu.Constants.GlobalConstants;
import ir.ac.kntu.GameObject.Tank.NormalTank;
import ir.ac.kntu.GameObject.Tank.PlayerTank;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import static ir.ac.kntu.Constants.GlobalConstants.CANVAS_HEIGHT;
import static ir.ac.kntu.Constants.GlobalConstants.CANVAS_WIDTH;

public class Game extends Application {
    private PlayerTank playerTank;
    private static Game game;

    public Game() {
        playerTank=new PlayerTank(100,200,3,Direction.UP,1);
        game=this;
    }
    public static Game getInstance(){
        return game;
    }

    @Override
    public void start(Stage stage) throws Exception{
        Canvas canvas=new Canvas(CANVAS_WIDTH,CANVAS_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        gc.fillRect(0,0, CANVAS_WIDTH,CANVAS_HEIGHT);
        NormalTank normalTank=new NormalTank(10,10,1, Direction.LEFT,1);
        normalTank.draw(gc);
        PlayerTank playerTank1=new PlayerTank(50,50,3,Direction.DOWN,1);
        Group root=new Group(canvas);
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public PlayerTank getPlayer() {
        return playerTank;
    }
}
