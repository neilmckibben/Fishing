//gamers rise up
/**
 *
 * @author Ben Kowalski
 *
 */
public final class Island {
    public static void main(String[] args) {

        final String[] fishies = { "guppy", "goby", "salmon", "trout", "dace",
                "bass" };
        int time = 0;
        int fishType = 0;
        boolean caught = false;
        boolean openTheGame = true;

        //infinite loop to cause the game to continuously go
        while (openTheGame) {
            //Set up variables
            System.out.println("Woah a fish appeared!");
            time = (int) (Math.random() * 500000000);
            fishType = (int) (Math.random() * 6);

            //loop that simulates the user having the opportunity to catch a fish
            while (time > 0 && !caught) {
                if (System.in.toString() != "") {
                    caught = true;
                }
                time--;
            }

            if (caught) {
                System.out.println("Yay! You did it, looks like it was a "
                        + fishies[fishType] + "!");
            } else {
                System.out.println("Aww, it got away");
            }

            System.out.println(
                    "Are you ready to play again? (enter 'y' for yes and 'n' for no)");
            String input = System.lineSeparator().toString();
            if (input.charAt(input.length() - 1) == 'n') {
                System.out.println("Thanks for playing!");
                openTheGame = false;
            }
        }
    }

}
