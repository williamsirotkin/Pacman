package cs1302.pacman.hbox;

import javafx.scene.image.ImageView;
import cs1302.pacman.imageview.LittleDot;
import cs1302.pacman.imageview.Pacman;

/**
 * Creates an HBox with all little dots for image views.
 */
public class LittleDotHBox extends HBoxTemplate {

    /**
     * Constructs a LittleDotHBox Object
     */
    public LittleDotHBox(int pacman) {
        super();

        imageview = new ImageView[10];
        for (int i = 0; i < 10; i++) {
            if (i == 5 && pacman == 7) {
                imageview[i] = new Pacman(1);
            } else {
                imageview[i] = new LittleDot();
            }
            super.getChildren().add(imageview[i]);
        } //for

    } // LittleDotHBox

} //LittleDotHBox
