package cs1302.pacman.imageview;

import java.util.Random;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

/**
 * Creates a Ghost Object.
 */
public class Ghost extends ImageView {

    //Keeps Track Of Ghost's Speed and Direction They Face
    private double speed;

    /**
     * Constructs a Ghost Object.
     *
     */
    public Ghost(int ghost) {
        super();

        if (ghost == 0) {
            super.setImage(new Image("file:resources/ghost1Image.png", 50, 50, false, false));
        } else {
            super.setImage(new Image("file:resources/ghost2Image.png", 50, 50, false, false));
        }
    }
}
