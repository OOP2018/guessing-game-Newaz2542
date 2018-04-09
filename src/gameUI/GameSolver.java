package gameUI;
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
	public int play(NumberGame javis) {
		int upperbound = javis.getUpperBound();
		int lowerbound = 1;
		int mid = (lowerbound + (upperbound - lowerbound) / 2);
		boolean correct = false;
		while (!correct) {
			correct = javis.guess(mid);
			if (correct) {
				break;
			} else {

				if (javis.getMessage().toLowerCase().contains("small")) {
					lowerbound = mid + 1;
				} else if (javis.getMessage().toLowerCase().contains("large")) {
					upperbound = mid - 1;
				}
				mid = (lowerbound + (upperbound - lowerbound) / 2);

			}
		}
		return mid;
	}

}
