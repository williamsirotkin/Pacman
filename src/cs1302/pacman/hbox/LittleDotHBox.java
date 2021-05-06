package cs1302.pacman.hbox;

/**
 * Creates an HBox with all little dots for image views.
 */
public class LittleDotHBox extends HBoxTemplate {

    /**
     * Constructs a LittleDotHBox Object
     */
    public LittleDotHBox() {
        super();

        for (int i = 0; i < 10; i++) {
            imageview[i] = new LittleDot();
        } //for

    } // LittleDotHBox

} //LittleDotHBox
