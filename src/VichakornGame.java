import java.util.Random;

/*
 * Game of Guessing a secret number. 
 * @author Vichakorn Yotboonrueang
 */
public class VichakornGame extends NumberGame {

	private int upperBound;
	private int secretNum;
	private int count = 0;

	public VichakornGame() {
		this(999);
	}

	public VichakornGame(int upperBound) {
		this.upperBound = upperBound;
		long seed = System.nanoTime();
		Random rand = new Random(seed);
		this.secretNum = rand.nextInt(999) + 1;
		super.setMessage("I'm thinking of a number between 1 and 999");
	}

	public boolean guess(int number) {
		if (number == secretNum) {
			setMessage("WOW U DID IT CAN'T BELIVE");
			count++;
			return true;
		}
		if (secretNum - 6 <= number && number < secretNum || secretNum + 6 >= number && number > secretNum) {
			setMessage("So close!");
			count++;
		} else if (number < secretNum) {
			setMessage("Your number is to low");
			count++;
		} else if (number > secretNum) {
			setMessage("Your number is to high");
			count++;
		}
		return false;
		
	}

	public int getCount() {
		return count;
	}

	public int getUpperBound() {
		return upperBound;
	}

	@Override
	public String toString() {
		return "Guessing the number.";
	}

}
