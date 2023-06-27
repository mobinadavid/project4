package ir.ac.kntu;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Game extends Application {
    public void start(Stage stage) throws Exception {
        stage.setTitle("Pong-Game");
        Canvas canvas = new Canvas(CANVAS_WIDTH, GlobalConstants.CANVAS_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(10),
                e -> start(gc)));
        tl.setCycleCount(Timeline.INDEFINITE);
        Scene scene = new Scene(new Pane(canvas));
        canvas.setOnMouseClicked(e -> gameState = GameState.RUNNING);
        //TODO attach EventHandler

        stage.setScene(scene);
        stage.show();
        tl.play();
    }

}
