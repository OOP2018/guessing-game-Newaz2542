import java.util.Scanner;
import java.util.Random;

/**
 * Automatically find the secret to any NumberGame
 * 
 * @author Vichakorn Yotboonrueang
 *
 */
public class GameSolver {
	/**
	 * The play method is a tools for find the secret number.
	 * 
	 * @param game
	 *            is a Constructors from NumberGame.
	 * @return the answer.
	 */
	public int play(NumberGame game) {

		int guess = 0;
		boolean correct = false;
		Random javis = new Random();
		do {
			guess = javis.nextInt(999) + 1;
			correct = game.guess(guess);

		} while (correct != true);
		return guess;
	}

}
