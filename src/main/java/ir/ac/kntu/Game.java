package ir.ac.kntu;

import ir.ac.kntu.Constants.GlobalConstants;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import static ir.ac.kntu.Constants.GlobalConstants.CANVAS_HEIGHT;
import static ir.ac.kntu.Constants.GlobalConstants.CANVAS_WIDTH;

public class Game extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        Canvas canvas=new Canvas(CANVAS_WIDTH,CANVAS_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Group root=new Group(canvas);
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
