package cs1302.pacman.hbox;

import javafx.scene.image.ImageView;
import cs1302.pacman.imageview.Box;
import cs1302.pacman.imageview.LittleDot;


/**
 * Creates an HBox with boxes in certain parts.
 */
public class BoxHBox extends HBoxTemplate {

    /**
     * Constructs a BoxHBox object.
     */
    public BoxHBox() {
        super();

        imageview = new ImageView[10];
        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 3 || i == 6 || i == 9) {
                imageview[i] = new LittleDot();
            } else {
                imageview[i] = new Box();
            }
            super.getChildren().add(imageview[i]);
        }
    }
}
