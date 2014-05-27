/*
 * Es_10App.java
 */

package es_10;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class Es_10App extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new Es_10View(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of Es_10App
     */
    public static Es_10App getApplication() {
        return Application.getInstance(Es_10App.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(Es_10App.class, args);
    }
}
