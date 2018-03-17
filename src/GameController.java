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
	private NumberGame game ;
	private CounterView view ;
	@FXML
	TextField textfield;
	@FXML
	Label label;
	@FXML
	public void initialize() {
		view.run();
		label.setText("Your Answer");
	}
	/**
	 * Set default of application
	 */
	public GameController(){
		game = new VichakornGame(555);
		view = new CounterView(game);
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
			view.displayCount();
		} catch (NumberFormatException ex) {
			textfield.setText("Plese input number");
			textfield.setStyle("-fx-text-inner-color: red;");
		}
	}
}
