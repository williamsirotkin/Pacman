package cs1302.pacman.hbox;

/**
 * Creates an HBox with boxes in certain parts.
 */
public class BoxHBox extends HBoxTemplate {

    /**
     * Constructs a BoxHBox object.
     */
    public BoxHBox() {
        super();

        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 3 || i == 6 || i == 9) {
                imageview[i] = new LittleDot();
            } else {
                imageview[i] = new Box();
            }
        }
    }
}
