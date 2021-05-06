package cs1302.pacman;

import javafx.application.Application;

/**
 * Driver for the pacman game class.
 */
public class Driver {

    public static void main(String[] args) {
        try {
            Application.launch(PacmanGame.class, args);
        } catch (Exception e) {
            System.out.println("There was an error with the application");
            System.exit(1);
        } // catch
    } // main
} // Driver
