package cs1302.pacman.hbox;

/**
 * Creates an HBox with boxes and a ghost spawn box in the middle.
 */
public class GhostHBox extends HBoxTemplate {

    /**
     * Constructs a GhostHBox Object
     */
    public GhostHBox() {
        super();

        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 3 || i == 6 || i == 9) {
                imageview[i] = new LittleDot();
            } else if (i == 1 || i == 2 || i == 7 || i == 8) {
                imageview[i] = new Box();
            } else {
                imageview[i] = new Ghost();
            }
        }

    }
}
