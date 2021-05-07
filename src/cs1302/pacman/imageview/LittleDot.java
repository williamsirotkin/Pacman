package cs1302.pacman.imageview;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

/**
 * Creates a little dot on the map.
 */
public class LittleDot extends ImageView {

    /**
     * Constructs a little dot object.
     */
    public LittleDot() {
        super();
        super.setImage(new Image("file:resources/littleDotImage.png", 50, 50, false, false));
    }
}
