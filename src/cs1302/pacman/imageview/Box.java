package cs1302.pacman.imageview;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

/**
 * Creates a Box which acts as a barrier
 */
public class Box extends ImageView {

    /**
     * Constructs a Box Object.
     */
    public Box() {
        this.setImage(new Image("file:resources/boxImage.png", 50, 50, false, false));
    }
}
