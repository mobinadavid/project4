package ir.ac.kntu;

import com.sun.javafx.tk.quantum.PrimaryTimer;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Menu {

    public static Boolean result;

    public static void battleMenu(Stage stage, Scene scene) {
        Stage primaryStage = new Stage();
        Image image = new Image("file:Battle.jpg");
        ImageView imageView = new ImageView(image);
        Rectangle clickableArea = new Rectangle(100, 100, 200, 300);
        clickableArea.setFill(Color.TRANSPARENT);
        clickableArea.setOnMouseClicked(e -> {
            menu(stage, scene);
            primaryStage.close();
            ;

        });
        StackPane root = new StackPane();
        root.getChildren().addAll(imageView, clickableArea);
        Scene scene1 = new Scene(root, 900, 700);
        primaryStage.setTitle("Welcome Scene");
        primaryStage.setScene(scene1);

        primaryStage.show();
    }

    public static void menu(Stage stage, Scene scene1) {
        Image backgroundImage = new Image("file:images.jfif");
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.REPEAT,BackgroundRepeat.REPEAT, BackgroundPosition.CENTER, new BackgroundSize(100, 100, true, true, true, false));
        VBox menu = new VBox();
        menu.setAlignment(Pos.CENTER);
        menu.setPadding(new Insets(50, 0, 0, 0));
        menu.setSpacing(30);
        Stage primaryStage = new Stage();
        for (int i = 1; i <= 10; i++) {
            Button button = new Button("STAGE " + i);
            button.setStyle("-fx-background-color: #777777; -fx-text-fill: white; -fx-font-size: 20px; -fx-font-family: Arial;");
            button.setStyle("-fx-background-color: #777777; -fx-text-fill: white; -fx-font-size: 20px; -fx-font-family: Arial;");
            button.setOnMouseEntered(e -> button.setStyle("-fx-background-color: darkGray; -fx-text-fill: white; -fx-font-size: 20px; -fx-font-family: 'Cambria';"));
            button.setOnMouseExited(e -> button.setStyle("-fx-background-color: #777777; -fx-text-fill: white; -fx-font-size: 20px; -fx-font-family: 'Cambria';"));
            button.setOnMousePressed(e -> button.setEffect(new DropShadow()));
            menu.getChildren().add(button);
            button.setOnAction(l -> {
                stage.show();
                stage.setScene(scene1);
                primaryStage.close();
            });
        }
        StackPane root = new StackPane();
        root.setBackground(new Background(background));
        root.getChildren().add(menu);
        Scene scene = new Scene(root, 800, 800);
        primaryStage.setTitle("Game Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
