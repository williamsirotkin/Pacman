package cs1302.pacman;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Creates Pacman game.
 */
public class Pacman extends VBox {

    private int score;
    private int lives;
    private Label scoreLabel;
    private Label livesLabel;
    private HBox scoreAndLivesHBox;
    private HBox mapHBox;

    private Map map;
    private cs1302.pacman.imageview.Pacman pacman;


    /**
     * Constructs a Pacman object.
     */
    public Pacman() {
        super();

        score = 0;
        lives = 3;

        scoreLabel = new Label("Score: 0");
        livesLabel = new Label("Lives: 3");
        scoreAndLivesHBox.getChildren().addAll(scoreLabel, livesLabel);

        mapHBox.getChildren().add(map);

        super.getChildren().addAll(scoreAndLivesHBox, mapHBox);
    } // Pacman

    /**
     *
     */
    public int getScore() {
        return score;
    }

    /**
     *
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     *
     */
    public int getLives() {
        return lives;
    }

    /**
     *
     */
    public void setLives(int lives) {
        this.lives = lives;
    }

    /**
     *
     */
    public void setScoreLabel(int score) {
        scoreLabel.setText("Score: " + score);
    }

    /**
     *
     */
    public void setLivesLabel(int lives) {
        livesLabel.setText("Lives: " + lives);
    }

    /**
     *
     */
    public void updateScore() {
        Platform.runLater(() -> {
            while (getLives() != 0) {
                setScore(map.getDotsEaten() * 10 + Math.pow(2, map.getFruitEaten()) * 100);
                setScoreLabel(getScore());
            }
        });
    }

    /**
     *
     */
    public void updateLives() {
        Platform.runLater(() -> {
            while (getLives() != 0) {
                setLives(3 - map.getTimesDied());
                setLivesLabel(getLives());
            }
        });
    }

    /**
     *
     */
    public void updateGhostOne() {
        Platform.runLater(() -> {
            while (getLives(() != 0) {

            }
        }
    }


}
