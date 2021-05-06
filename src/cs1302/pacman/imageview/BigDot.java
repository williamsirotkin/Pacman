package cs1302.pacman.imageview;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

/**
 * Creates a Big DotImageview.
 */
public class BigDot extends ImageView {

    /**
     * Constructs a BigDot Object.
     */
    public BigDot() {
        super();
        this.setImage(new Image("file:bigDotImage.png", 50, 50, false, false));
    }

} // BigDot
