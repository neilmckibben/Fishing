import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Ben Kowalski
 *
 */

public class IslandView1 extends JFrame implements IslandView {

    private IslandController controller;

    /**
     * Text areas.
     */
    private final JTextArea topText;

    /**
     * Operator and related buttons.
     */
    private final JButton rod;

    /**
     * Default constructor.
     */
    public IslandView1() {

        // Create the JFrame being extended

        /*
         * Call the JFrame (superclass) constructor with a String parameter to
         * name the window in its title bar
         */
        super("Island Game");

        // Set up the GUI widgets --------------------------------------------

        /*
         * Create widgets
         */
        this.topText = new JTextArea("Open the game!", 5, 20);
        this.rod = new JButton("Pull up");

        // Set up the GUI widgets --------------------------------------------

        /*
         * Initially, the following buttons should be disabled: divide (divisor
         * must not be 0) and root (root must be at least 2) -- hint: see the
         * JButton method setEnabled
         */
        this.rod.setEnabled(false);

        /*
         * Create scroll panes for the text areas in case number is long enough
         * to require scrolling
         */
        this.topText.setLineWrap(true);
        this.topText.setEditable(false);

        /*
         * Create main button panel
         */
        JPanel mainPanel = new JPanel(new GridLayout(2, 1));

        /*
         * Add the buttons to the main button panel, from left to right and top
         * to bottom
         */
        mainPanel.add(this.topText);
        mainPanel.add(this.rod);

        // Set up the observers ----------------------------------------------

        /*
         * Register this object as the observer for all GUI events
         */
        this.rod.addActionListener(this);

        /*
         * Set up initial state of GUI to behave like last event was "Clear";
         * currentState is not a GUI widget per se, but is needed to process
         * digit button events appropriately
         */

        // Set up the main application window --------------------------------

        /*
         * Make sure the main window is appropriately sized, exits this program
         * on close, and becomes visible to the user
         */

        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    /**
     * Register argument as observer/listener of this; this must be done first,
     * before any other methods of this class are called.
     *
     * @param controller
     *            controller to register
     */
    @Override
    public void registerObserver(IslandController controller) {
        this.controller = controller;
    }

    /**
     * Update the text
     */
    @Override
    public void updateTextBox(String newText) {
        this.topText.setText(newText);
    }

    @Override
    public void updateRodEnabled(boolean rodStatus) {

        this.rod.setEnabled(rodStatus);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
