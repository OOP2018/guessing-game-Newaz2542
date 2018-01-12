import java.util.Scanner;

/**
 * Play guessing game on the console.
 */
public class GameConsole {

	/**
	 * The play method plays a game using input from user.
	 * 
	 * @param game
	 *            is a Constructors from NumberGame.
	 * @return the correct answer.
	 */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);

		// describe the game
		System.out.println(game.toString());

		// This is just an example.
		System.out.println(game.getMessage());
		int guess = 0;
		boolean correct = false;
		do {
			System.out.print("Your answer? ");
			guess = console.nextInt();
			correct = game.guess(guess);
			System.out.println(game.getMessage());
		} while (correct != true);
		return guess;
	}

}
