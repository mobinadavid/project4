package ir.ac.kntu.GameController;

import ir.ac.kntu.Constants.Direction;
import ir.ac.kntu.Game;
import javafx.scene.input.KeyCode;

public class PlayerController implements InputManager{
    private static PlayerController instance = new PlayerController();

    public static PlayerController getInstance() {
        return instance;
    }

    private PlayerController() {}

    @Override
    public void handlePlayerMovements(KeyCode keyCode) {
        Game game=Game.getInstance();
       switch (keyCode){
           case RIGHT -> game.getPlayer().move(30, Direction.RIGHT);
           case DOWN -> game.getPlayer().move(30,Direction.DOWN);
           case UP -> game.getPlayer().move(30,Direction.UP);
           case LEFT -> game.getPlayer().move(30,Direction.LEFT);
       }

    }
}
