import java.awt.event.ActionListener;

/**
 *
 * @author Ben Kowalski
 *
 */

public interface IslandView extends ActionListener {

    /**
     * Register argument as observer/listener of this; this must be done first,
     * before any other methods of this class are called.
     *
     * @param controller
     *            controller to register
     */
    void registerObserver(IslandController controller);

    /**
     * Update the text
     */
    void updateTextBox(String newText);

    void updateRodEnabled(boolean rodStatus);
}
