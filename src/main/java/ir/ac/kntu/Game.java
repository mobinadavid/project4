package ir.ac.kntu;

import ir.ac.kntu.Constants.Direction;
import ir.ac.kntu.Constants.GlobalConstants;
import ir.ac.kntu.GameController.PlayerController;
import ir.ac.kntu.GameObject.GameObject;
import ir.ac.kntu.GameObject.Tank.ArmoredTank;
import ir.ac.kntu.GameObject.Tank.NormalTank;
import ir.ac.kntu.GameObject.Tank.PlayerTank;
import ir.ac.kntu.GameObject.wall.BrickWall;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;

import static ir.ac.kntu.Constants.GlobalConstants.CANVAS_HEIGHT;
import static ir.ac.kntu.Constants.GlobalConstants.CANVAS_WIDTH;

public class Game extends Application {
    private PlayerTank playerTank;
    private static Game game;
    ArrayList<GameObject> gameObjects = new ArrayList<>();

    public Game() {
        playerTank = new PlayerTank(100, 200, 3, Direction.UP, 1);
        game = this;
    }

    public static Game getInstance() {
        return game;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.fillRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
        NormalTank normalTank = new NormalTank(10, 10, 1, Direction.RIGHT, 1);
        ArmoredTank armoredTank = new ArmoredTank(100, 10, 2, Direction.DOWN, 2);
        BrickWall brickWall=new BrickWall(400-18,400-36,1);
        BrickWall brickWall1=new BrickWall(400-18,400-72,1);
        gameObjects.add(brickWall1);
        gameObjects.add(normalTank);
        gameObjects.add(playerTank);
        gameObjects.add(armoredTank);
        gameObjects.add(brickWall);
        draw(gc);
        Group root = new Group();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root, Color.BLACK);
        scene.setOnKeyPressed(keyEvent -> {
            KeyCode keyCode = keyEvent.getCode();
            PlayerController.getInstance().handlePlayerMovements(keyCode);
            draw(gc);
        });
        stage.setScene(scene);
        stage.show();
    }

    public PlayerTank getPlayer() {
        return playerTank;
    }

    public void draw(GraphicsContext gc) {
        gc.clearRect(0, 0, 800, 800);
        for (GameObject gameObject : gameObjects) {
            if (gameObject instanceof PlayerTank) {
                ((PlayerTank) gameObject).draw(gc);
            }
            if (gameObject instanceof NormalTank) {
                ((NormalTank) gameObject).draw(gc);
            }
            if (gameObject instanceof ArmoredTank) {
                ((ArmoredTank) gameObject).draw(gc);
            }

            if (gameObject instanceof BrickWall) {
                ((BrickWall) gameObject).draw(gc);
            }

        }
    }


}
