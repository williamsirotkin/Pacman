package cs1302.pacman.hbox;

import javafx.scene.image.ImageView;
import cs1302.pacman.imageview.Ghost;
import cs1302.pacman.imageview.Box;
import cs1302.pacman.imageview.LittleDot;


/**
 * Creates an HBox with boxes and a ghost spawn box in the middle.
 */
public class GhostHBox extends HBoxTemplate {

    /**
     * Constructs a GhostHBox Object
     */
    public GhostHBox() {
        super();

        imageview = new ImageView[10];
        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 3 || i == 6 || i == 9) {
                imageview[i] = new LittleDot();
            } else if (i == 1 || i == 2 || i == 7 || i == 8) {
                imageview[i] = new Box();
            } else if (i == 4) {
                imageview[i] = new Ghost(0);
            } else if (i == 5) {
                imageview[i] = new Ghost(1);
            }
        }

        for (int i = 0; i < 10; i++) {
            super.getChildren().add(imageview[i]);
        }
    }
}
