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


    public static void menu(Stage primaryStage) {
        // Create a VBox to hold the menu buttons
        VBox menu = new VBox();
        menu.setPadding(new Insets(10));
        menu.setSpacing(10);

        // Create 10 menu buttons with different colors
        Button button1 = createButton("Option 1", Color.RED);
        Button button2 = createButton("Option 2", Color.ORANGE);
        Button button3 = createButton("Option 3", Color.YELLOW);
        Button button4 = createButton("Option 4", Color.GREEN);
        Button button5 = createButton("Option 5", Color.BLUE);
        Button button6 = createButton("Option 6", Color.PURPLE);
        Button button7 = createButton("Option 7", Color.PINK);
        Button button8 = createButton("Option 8", Color.BROWN);
        Button button9 = createButton("Option 9", Color.GRAY);
        Button button10 = createButton("Option 10", Color.BLACK);

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

    public static Button createButton(String text, Color color) {
        Button button = new Button(text);
        button.setStyle("-fx-background-color: " + color.toString().replace("0x", "#"));
        button.setOnAction(event -> button.setStyle("-fx-background-color: " + color.invert().toString().replace("0x", "#")));
        return button;
    }


}
