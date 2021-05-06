package cs1302.pacman.imageview;

import java.util.Random;

/**
 * Creates a Ghost Object.
 */
public class Ghost extends ImageView {

    //Keeps Track Of Ghost's Speed and Direction They Face
    private double speed;

    /**
     * Constructs a Ghost Object.
     *
     * @param level the level of the game
     */
    public Ghost(int level) {
        super();

        this.speed = 0.8 + level/10;

        Random random = new Random();
        int ghostColorInt = random.nextInt(4);

        if (ghostColorInt == 0) {
            this.setImage();
        } else if (ghostColorInt == 1) {
            this.setImage();
        } else if (ghostColorInt == 2) {
            this.setImage();
        } else {
            this.setImage();
        }
    }
}
