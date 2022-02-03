package cs1302.pacman;

import java.lang.Thread;

/**
 * Creates pacman game.
 */
public class PacmanGame extends Game {

    public PacmanGame(int width, int height, int fps) {
        super(width, height, fps);
    }

    /**
     * Perform one iteration of the main game loop.
     */
    @Override
    protected void update() {
        Thread pacmanThread = new Thread(() -> {
            pacmanVBox.updatePacman();
        });
        pacmanThread.setDaemon(true);
        pacmanThread.start();

        Thread ghostOneThread = new Thread(() -> {
            pacmanVBox.updateGhostOne();
        });
        ghostOneThread.setDaemon(true);
        ghostOneThread.start();

        Thread ghostTwoThread = new Thread(() -> {
            pacmanVBox.updateGhostTwo();
        });
        ghostTwoThread.setDaemon(true);
        ghostTwoThread.start();

        Thread scoreThread = new Thread(() -> {
            pacmanVBox.updateScore();
        });
        scoreThread.setDaemon(true);
        scoreThread.start();

        Thread livesThread = new Thread(() -> {
            pacmanVBox.updateLives();
        });
        livesThread.setDaemon(true);
        livesThread.start();

        Thread resetThread = new Thread(() -> {
            pacmanVBox.reset();
        });
        resetThread.setDaemon(true);
        resetThread.start();

    } // update
}
