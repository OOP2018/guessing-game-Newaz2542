import java.util.Random;

/*
 * Game of Guessing a secret number. 
 * @author Vichakorn Yotboonrueang
 */
public class VichakornGame extends NumberGame {
	/** upper bound for secret number. */
	private int upperBound;
	/** the solution to the game. */
	private int secretNum;
	/** show round you done. */
	private int count = 0;

	/** Initialize a new default game. */
	public VichakornGame() {
		this(100);
	}

	/**
	 * properties of a guessing game.
	 * 
	 * @param upperbound
	 *            is the max value for the secret number.
	 */
	public VichakornGame(int upperBound) {
		this.upperBound = upperBound;
		long seed = System.nanoTime();
		Random rand = new Random(seed);
		this.secretNum = rand.nextInt(upperBound) + 1;
		super.setMessage("I'm thinking of a number between 1 and 999");
	}

	/**
	 * Evaluate a user's guess.Also set a message to help the user.
	 * 
	 * @return true if it is correct.
	 */
	public boolean guess(int number) {
		if (number == secretNum) {
			setMessage("WOW U DID IT CAN'T BELIVE");
			count++;
			return true;
		} else if (number < secretNum) {
			setMessage("Your number is to small");
			count++;
		} else if (number > secretNum) {
			setMessage("Your number is to large");
			count++;
		}
		return false;

	}

	/**
	 * Return the round that has been played.
	 * 
	 * @return count for show the round of player.
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Return the upperbound for the solution to this game.
	 */
	public int getUpperBound() {
		return upperBound;
	}

	/**
	 * Describe the game.
	 */
	@Override
	public String toString() {
		return "Guessing the number.";
	}

}
