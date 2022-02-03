package cs1302.pacman.hbox;

import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * Creates a Template to create hbox objects.
 */
public abstract class HBoxTemplate extends HBox {

    //ImageView Objects
    ImageView[] imageview;

    /**
     * Sets an imageview to a given x coordinate.
     *
     * @param x the coordinate the imageview will be set
     * @param imageview the imageview that will be set
     */
    public void set(int x, ImageView imageview) {
        this.imageview[x] = imageview;
    }

    /**
     * Returns an imageview at a given x coordinate.
     *
     * @param x the coordinate of the imageview to be returned
     * @return the imageview at that coordinate
     */
    public ImageView get(int x) {
        return imageview[x];
    }
}
