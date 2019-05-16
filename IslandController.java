
public interface IslandController {

    /**
     * returns keyboard input when keyboard is interacted with
     *
     * @return Returns key that was pressed
     */
    String processKeyPress();

    /**
     * Resets game to initial state
     */
    void processGameRestart();

}
