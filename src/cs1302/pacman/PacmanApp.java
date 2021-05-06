package cs1302.pacman;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Creates pacman app.
 */
public class PacmanApp extends Application {

    Pacman pacmanVBox = new Pacman();
    PacmanGame pacmanGame = new PacmanGame();

    /**
     * Runs Pacman.
     */
    public void start(Stage stage) {

        //Setting Scene With VBox
        Scene scene = new Scene(pacmanVBox);

        //Setting Stage
        stage.setMaxWidth(550);
        stage.setMaxHeight(550);
        stage.setTitle("Pacman");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();

        pacmanGame.update();
    }
}
