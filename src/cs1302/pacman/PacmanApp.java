package cs1302.pacman;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Creates pacman app.
 */
public class PacmanApp extends Application {

    Pacman pacmanVBox = new Pacman();
//    PacmanGame pacmanGame = new PacmanGame(550, 550, 5);

    /**
     * Runs Pacman.
     */
    public void start(Stage stage) {

        //Setting Scene With VBox
        Scene scene = new Scene(pacmanVBox);

        //Setting Stage
        stage.setMaxWidth(720);
        stage.setMaxHeight(720);
        stage.setTitle("Pacman");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();

//        pacmanGame.update();
    }
}
