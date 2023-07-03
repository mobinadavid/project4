package ir.ac.kntu.GameController;

import ir.ac.kntu.Constants.Direction;
import ir.ac.kntu.Main;
import javafx.scene.input.KeyCode;

public class PlayerController implements InputManager {
    private static PlayerController instance = new PlayerController();

    public static PlayerController getInstance() {
        return instance;
    }

    private PlayerController() {
    }

    @Override
    public void handlePlayerMovements(KeyCode keyCode) {
        Main.Game game = Main.Game.getInstance();
        switch (keyCode) {
            case RIGHT -> game.getPlayer().move(5, Direction.RIGHT);
            case DOWN -> game.getPlayer().move(5, Direction.DOWN);
            case UP -> game.getPlayer().move(5, Direction.UP);
            case LEFT -> game.getPlayer().move(5, Direction.LEFT);
            default -> game.getPlayer().move(5, Direction.LEFT);
        }

    }
}
