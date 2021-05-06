package cs1302.pacman.hbox;

import javafx.scene.image.ImageView;
import cs1302.pacman.imageview.BigDot;
import cs1302.pacman.imageview.LittleDot;


/**
 * Creates an HBox for top and bottom rows of pacman map.
 */
public class BigDotHBox extends HBoxTemplate {

    /**
     * Constructs a BigDotHBox Object.
     */
    public BigDotHBox() {
        super();

        imageview = new ImageView[10];
        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 9) {
                imageview[i] = new BigDot();
            } else {
                imageview[i] = new LittleDot();
            } // else
        } // for

        for (int i = 0; i < 10; i++) {
            this.getChildren().add(imageview[i]);
        } // for

    } //BigDotHBox

} // BigDotHBox
