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

/**
 * Creates the Pacman Map.
 */
public class Map extends VBox {

    private int dotsEaten;
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
        hbox[2] = new LittleDotHBox();
        hbox[3] = new BoxHBox();
        hbox[4] = new GhostHBox();
        hbox[5] = new LittleDotHBox();
        hbox[6] = new BoxHBox();
        hbox[7] = new LittleDotHBox();
        hbox[8] = new BoxHBox();
        hbox[9] = new BigDotHBox();

        for (int i = 0; i < 10; i++) {
            this.getChildren().add(hbox[i]);
        } // for
    } // Map

    /**
     * Removes a dot from the given coordinates.
     *
     * @param x      x coordinate to remove dot fromx
     * @param y      y coordinate to remove dot from
     */
    public void removeDot(int x, int y) {
//        hbox[x].removeDot(y);
        dotsEaten++;
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
    public int getDotsEaten() {
        return dotsEaten;
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

} // Map
