package cs1302.pacman.imageview;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

/**
 * Creates the pacman object
 */
public class Pacman extends ImageView {

    //Keeps Track Of Pacman's Speed and Direction He Faces
    private double speed;
    private String direction;

    /**
     * Constructs a Pacman Object.
     *
     * @param level the level of the game
     */
    public Pacman(int level) {
        super();

        this.setImage(new Image("file:resources/pacmanFacingLeft.png", 50, 50, false, false));
        this.speed = 1.0 + level/10;
        this.direction = "left";
    }

    /**
     *
     */
    public String getDirection() {
        return direction;
    }

    /**
     *
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     *
     */
    public double getSpeed() {
        return speed;
    }

    /**
     *
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
