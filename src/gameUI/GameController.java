package gameUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 * Controller of GuessingGameUI.fxml
 * @author Vichakorn
 *
 */
public class GameController {
	private NumberGame game = new VichakornGame() ;
	private CounterView view ;
	@FXML
	TextField textfield;
	@FXML
	Label label;
	@FXML
	public void initialize() {
		label.setText("Your Answer");
	}
	public void setGame(NumberGame game) {
		this.game = game;
	}
	/**
	 * When user have event on UI it'll run the guessing game.
	 * @param event
	 */
	public void handleAnswer(ActionEvent event) {
		textfield.setStyle("-fx-text-inner-color: black;");
		try {
			String text = textfield.getText().trim();
			int ans = Integer.parseInt(text);
			game.guess(ans);
			label.setText(game.getMessage());
			} catch (NumberFormatException ex) {
			textfield.setText("Plese input number");
			textfield.setStyle("-fx-text-inner-color: red;");
		}
	}
}
