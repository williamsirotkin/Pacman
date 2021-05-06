package cs1302.pacman.imageview;

import java.util.Random;
import java.lang.Math;
import javafx.scene.image.ImageView;

/**
 * Creates a Fruit Object Which Can Be Eaten To Allow Extra Points
 */
public class Fruit extends ImageView {

    //Instance Variables Of A Fruit
    private String fruit;
    private int points;
    private int x;
    private int y;
    private boolean exists;

    /**
     * Constructs a Fruit Object
     */
    public Fruit(int level) {
        if (level % 2 != 0) {
            exists = false;
        } else {
            exists = true;
            if (level == 2) {
                fruit = "";
            } else if (level == 4) {
                fruit = "";
            } else if (level == 6) {
                fruit = "";
            } else if (level == 8) {
                fruit = "";
            } else if (level == 10) {
                fruit = "";
            }

            Random random = new Random();
            boolean valid = false;
            while (!valid) {
                x = random.nextInt(10);
                y = random.nextInt(10);
                if (y == 5 || y == 7) {
                    valid = true;
                } else if (y == 0 || y == 9) {
                    if (x != 0 && x != 9) {
                        valid = true;
                    }
                } else if (y == 2) {
                    if (x != 5) {
                        valid = true;
                    }
                } else {
                    if (x != 1 && x != 2 && x != 4 && x != 5 && x != 7 && x != 8) {
                        valid = true;
                    }
                }
            }
            points = Math.pow(2, level - 1) / 100;
        }
    } // Fruit

    /**
     * Returns points given to player if pacman eats the fruit.
     *
     * @return the number of points given to player.
     */
    public int getPoints() {
        return points;
    }

    /**
     *
     */
    public int getXCoordinate() {
        return x;
    }

    public int getYCoordinate() {
        return y;
    }

}
