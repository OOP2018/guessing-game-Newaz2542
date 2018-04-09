package gameUI;
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
	/** your guess number. */
	private int number = 0;

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
		this.number = number;
		if (number == secretNum) {
			setMessage("WOW U DID IT CAN'T BELIEVE");
			count++;
			setChanged();
			notifyObservers();
			return true;
		} else if (number < secretNum) {
			setMessage(number+" is to small");
			count++;
		} else if (number > secretNum) {
			setMessage(number+" number is to large");
			count++;
		}
		setChanged();
		notifyObservers();
		return false;

	}

	/**
	 * getCount is save the round that have been played.
	 * 
	 * @return count for show the round of player.
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Return the upperBound for the solution to this game.
	 * @return value of maximum guess.
	 */
	public int getUpperBound() {
		return upperBound;
	}
	
	public int getGuess() {
		return number;
	}

	/**
	 * Describe the game.
	 * @return text that describe the game.
	 */
	@Override
	public String toString() {
		return "Guessing the number.";
	}

}
