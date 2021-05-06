package cs1302.pacman;

import javafx.application.Application;
import java.lang.Exception;

/**
 * Driver for the pacman game class.
 */
public class Driver {

    public static void main(String[] args) {
        try {
            Application.launch(PacmanApp.class, args);
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println(e);
            System.exit(1);
        } // catch
    } // main
} // Driver
