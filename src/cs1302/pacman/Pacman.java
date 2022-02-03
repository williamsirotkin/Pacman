package cs1302.pacman;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.application.Platform;
 import javafx.scene.image.ImageView;

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

    /**
     * Constructs a Pacman object.
     */
    public Pacman() {
        super();

        score = 0;
        lives = 3;

        scoreLabel = new Label("Score: 0");
        livesLabel = new Label("Lives: 3");
        scoreAndLivesHBox = new HBox(10, scoreLabel, livesLabel);
        map = new Map(1);
        mapHBox = new HBox(map);

        this.getChildren().addAll(scoreAndLivesHBox, map);
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
            //Checks if Move is Valid
            java.util.Random random = new java.util.Random();
            ImageView imageview = blank;
            while (getLives() != 0) {
                int moveX = 0;
                int moveY = 0;
                boolean valid = false;
                while (!valid) {
                    valid = true;
                    moveX = random.nextInt(3) - 1;
                    moveY = random.nextInt(3) - 1;
                    if (map.canMoveThere(moveX, moveY) == false) {
                        valid = false;
                    }
                }
            }

            //Since Move is Valid
            map.setImageView(map.getX(ghostOne), map.getY(ghostOne), imageview);
            map.setImageView(map.getX(imageview + move), map.getY(imageview - move), ghostOne);
            imageview = map.getImageView(map.getX(ghostOne), map.getY(ghostOne));

        });
    } // updateGhostOne

    /**
     *
     */
    public void updateGhostTwo() {
        Platform.runLater(() -> {

            //Checks if Move is Valid
            java.util.Random random = new java.util.Random();
            ImageView imageview = blank;
            while (getLives() != 0) {
                int moveX = 0;
                int moveY = 0;
                boolean valid = false;
                while (!valid) {
                    valid = true;
                    moveX = random.nextInt(3) - 1;
                    moveY = random.nextInt(3) - 1;
                    if (map.canMoveThere(moveX, moveY) == false) {
                        valid = false;
                    }
                }

                //Since Move is Valid
                map.setImageView(map.getX(ghostTwo), map.getY(ghostTwo), imageview);
                map.setImageView(map.getX(imageview + move), map.getY(imageview - move), ghostTwo);
                imageview = map.getImageView(map.getX(ghostTwo), map.getY(ghostTwo));
            }
        });
    } //updateGhostTwo

    /**
     *
     */
    public void updatePacman() {
        userInputX = 0;
        userInputY = 0;

        ImageView blank = new ImageView();

        if (getUserInput().equals("up")) {
            userInputY = -1;
        } else if (getUserInput().equls("down")) {
            userInputY = 1;
        } else if (getUserInput().equals("right")) {
            userInputX = 1;
        } else if (getUserInput().equals("left")) {
            userInputX = -1;
        }

        //Since Move is Valid
         map.setImageView(map.getX(pacman), map.getY(pacman), blank);
         map.setImageView(map.getX(blank + move), map.getY(blank - move), pacman);
    }

    /**
     *
     */
    public void reset() {
        Platform.runLater(() -> {
            int timesDied = 0;
            while(getLives() != 0) {
                if (map.getTimesDied() > timesDied) {
                    timesDied++;
                    map.resetBoard();
                }
            }
        });
    }

} // Pacman
