import java.util.Scanner;
import java.util.Random;
/**
 * Automatically find the secret to any NumberGame
 * @author Vichakorn
 *
 */
public class GameSolver {
	/**
	 * The play method is a tools for find the secret number.
	 * @param game is a Constructors from NumberGame.
	 * @return the answer.
	 */
	public int play(NumberGame game) {

		// describe the game
		System.out.println(game.toString());

		// This is just an example.
		System.out.println(game.getMessage());
		int guess = 0;
		boolean correct = false;
		Random javis = new Random();
		do {
			System.out.print("Your answer? ");
			guess = javis.nextInt(999)+1;
			correct = game.guess(guess);
			System.out.println(game.getMessage());
		} while (correct != true);
		return guess;
	}

}
