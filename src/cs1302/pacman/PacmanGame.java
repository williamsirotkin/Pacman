package cs1302.pacman;

import javafx.scene.Scene;

/**
 * Creates pacman game.
 */
public class PacmanGame extends Game {

    Pacman pacmanVBox = new Pacman();

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

        update();
    }

    /**
     * Perform one iteration of the main game loop.
     */
    @Override
    protected void update() {
        Thread pacmanThread = new Thread(() -> {

        });
        pacmanThread.setDaemon(true);
        pacmanThread.start();

        Thread ghostOneThread = new Thread(() -> {

        });
        ghostOneThread.setDaemon(true);
        ghostOneThread.start();

        Thread ghostTwoThread = new Thread(() -> {

        });
        ghostTwoThread.setDaemon(true);
        ghostTwoThread.start();

        Thread scoreThread = new Thread(() -> {
            pacmanVBox.updateScore();
        });
        scoreThread.setDaemon(true);
        scoreThread.start();

        Thread livesThread = new Thread(() -> {

        });
        livesThread.setDaemon(true);
        livesThread.start();

    } // update
}
