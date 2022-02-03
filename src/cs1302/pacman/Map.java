
package cs1302.pacman;

import cs1302.pacman.imageview.Fruit;
import cs1302.pacman.imageview.Ghost;
import cs1302.pacman.imageview.Pacman;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import cs1302.pacman.hbox.BigDotHBox;
import cs1302.pacman.hbox.LittleDotHBox;
import cs1302.pacman.hbox.BoxHBox;
import cs1302.pacman.hbox.GhostHBox;
 import javafx.scene.image.ImageView;

/**
 * Creates the Pacman Map.
 */
public class Map extends VBox {

    private int dotsEaten;
    private int fruitEaten;
    private int timesDied;

    //Map is a VBox that contains 10 HBoxes
    private HBox[] hbox;

    //Fruit Object
    private Fruit fruit;

    //Pacman Object
    private Pacman pacman;

    /**
     * Constructs a Map Object.
     *
     * @param the level in the game
     */
    public Map(int level) {
        super();

        dotsEaten = 0;
        timesDied = 0;
        fruit = new Fruit(level);
        pacman = new Pacman(level);

        hbox = new HBox[10];
        hbox[0] = new BigDotHBox();
        hbox[1] = new BoxHBox();
        hbox[2] = new LittleDotHBox(2);
        hbox[3] = new BoxHBox();
        hbox[4] = new GhostHBox();
        hbox[5] = new LittleDotHBox(5);
        hbox[6] = new BoxHBox();
        hbox[7] = new LittleDotHBox(7);
        hbox[8] = new BoxHBox();
        hbox[9] = new BigDotHBox();

        for (int i = 0; i < 10; i++) {
            this.getChildren().add(hbox[i]);
        } // for
    } // Map

    /**
     * Pacman moves to a square with a dot, big dot, or fruit.
     *
     * @param x      x coordinate to remove dot fromx
     * @param y      y coordinate to remove dot from
     */
    public void pacmanEatsDot(int x, int y) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (hbox[i].get(j).equals(pacman)) {
                    hbox[i].set(j, blank);
                }
            }
        }

        if (hbox[y].get(x).equals(fruit)) {
            fruitEaten++;
        } else {
            dotsEaten++;
        }
        hbox[y].set(x, pacman);
    }


    /**
     * Calcualtes if pacman, ghosts, or fruit can move to given coordinates.
     *
     * @param x      x coordinate to move to
     * @param y      y coordinate to move to
     * @return true if pacman, ghosts, or fruit can move there else return false
     */
    public boolean canMoveThere(int x, int y) {
        if (y == 0 || y == 2 || y == 5 || y == 7 || y == 9) {
            return true;
        }

        if (x == 0 || x == 3 || x == 6 || x == 9) {
            return true;
        }

        return false;
    } // canMoveThere

    /**
     *
     */
    public void pacmanHitsAGhost() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (hbox[i].get(j).equals(pacman)) {
                    for (int a = -1; i < 2; a++) {
                        for (int b = -1; b < 2; b++) {
                            if (hbox[i + a].get(j + b).equals(ghost1)
                            || hbox[i + a].get(j + b).equals(ghost2)) {
                                setTimesDied(getTimesDied() + 1);
                            }
                        }
                    }
                }
            }
        }
    }



    /**
     *
     */
    public int getDotsEaten() {
        return dotsEaten;
    }

    /**
     *
     */
    public void setDotsEaten(int dotsEaten) {
        this.dotsEaten = dotsEaten;
    }

    /**
     *
     */
    public void setFruitEaten(int fruitEaten) {
        this.fruitEaten = fruitEaten;
    }

    /**
     *
     */
    public int getFruitEaten() {
        return fruitEaten;
    }

    /**
     *
     */
    public int getTimesDied() {
        return timesDied;
    }


    /**
     *
     */
    public void setTimesDied(int timesDied) {
        this.timesDied = timesDied;
    }

    /**
     *
     */
    public void resetBoard() {
        hbox[0] = new BigDotHBox();
        hbox[1] = new BoxHBox();
        hbox[2] = new LittleDotHBox();
        hbox[3] = new BoxHBox();
        hbox[4] = new GhostHBox();
        hbox[5] = new LittleDotHBox();
        hbox[6] = new BoxHBox();
        hbox[7] = new LittleDotHBox(pacman);
        hbox[8] = new BoxHBox();
        hbox[9] = new BigDotHBox();
        this.getChildren().add(hbox[i]);
    }

    /**
     *
     */
    public void setImageView(int x, int y, ImageView imageview) {
        hbox[y].set(x, imageview);
    }

    /**
     *
     */
    public ImageView getImageView(int x, int y) {
        return hbox[y].get(x);
    }

    /**
     *
     */
    public int getX(ImageView imageview) {
    }

    /**
     *
     */
    public int getY(Imageview imageview) {
    }

} // Map
