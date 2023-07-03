package ir.ac.kntu;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameState {
     public static  Boolean result;
   public  static boolean quit(){
       Stage stage=new Stage();
       stage.setTitle("Close Program");
       stage.setMinWidth(300);
       Label label=new Label("sure you wanna quit ?");
       Button yes=new Button("Yes");
       Button no=new Button("No");

       yes.setOnAction(l->{
           result=true;
           stage.close();
       });
       no.setOnAction(l->{
           result=false;
           stage.close();
       });
       VBox vBox=new VBox(15);
       vBox.setAlignment(Pos.CENTER);
       vBox.getChildren().addAll(label,yes,no);
       Scene scene=new Scene(vBox,200,200);
       stage.setScene(scene);
       stage.showAndWait();
       return result;
   }
}
