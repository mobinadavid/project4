package ir.ac.kntu;

import com.sun.javafx.tk.quantum.PrimaryTimer;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Menu {


    public static void menu(Stage primaryStage,Scene scene1) {
        // Create a VBox to hold the menu buttons
        VBox menu = new VBox();
        menu.setPadding(new Insets(10));
        menu.setSpacing(10);
        Game game=new Game();
        // Create 10 menu buttons with different colors
        Button button1 = createButton("Option 1", primaryStage,scene1);
        Button button2 = createButton("Option 2", primaryStage,scene1);
        Button button3 = createButton("Option 3", primaryStage,scene1);
        Button button4 = createButton("Option 4", primaryStage,scene1);
        Button button5 = createButton("Option 5", primaryStage,scene1);
        Button button6 = createButton("Option 6", primaryStage,scene1);
        Button button7 = createButton("Option 7", primaryStage,scene1);
        Button button8 = createButton("Option 8", primaryStage,scene1);
        Button button9 = createButton("Option 9", primaryStage,scene1);
        Button button10 = createButton("Option 10", primaryStage,scene1);

        // Add the menu buttons to the VBox
        menu.getChildren().addAll(button1, button2, button3, button4, button5, button6, button7, button8, button9, button10);

        // Create a Scene with the VBox as the root node
        Scene scene = new Scene(menu, 300, 500);

        // Set the title of the Stage to "Game Menu"
        primaryStage.setTitle("Game Menu");
        button1.setOnAction(l->{

        });
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();

    }

    public static Button createButton(String text,Stage stage,Scene scene) {
        Button button = new Button(text);
        button.setOnAction(event -> {
            // Create a new Scene for the game
            stage.setScene(scene);
                Game game=new Game();
            stage.hide();
          stage.show();;
        });
        return button;
    }


}
