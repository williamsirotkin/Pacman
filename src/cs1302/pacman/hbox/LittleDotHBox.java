package cs1302.pacman.hbox;

import javafx.scene.image.ImageView;
import cs1302.pacman.imageview.LittleDot;

/**
 * Creates an HBox with all little dots for image views.
 */
public class LittleDotHBox extends HBoxTemplate {

    /**
     * Constructs a LittleDotHBox Object
     */
    public LittleDotHBox() {
        super();

        imageview = new ImageView[10];
        for (int i = 0; i < 10; i++) {
            imageview[i] = new LittleDot();
            super.getChildren().add(imageview[i]);
        } //for

    } // LittleDotHBox

} //LittleDotHBox
