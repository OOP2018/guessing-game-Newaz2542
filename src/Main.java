import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * A main class for the GuessingGame. It is responsible for creating objects,
 * connecting objects, and running the game UI.
 */
public class Main extends Application {
	// public static void mainConsole(String[] args) {
	// // upper limit for secret number in guessing game
	// int upperBound = 999;
	// NumberGame game = new VichakornGame(upperBound);
	// GameSolver ui = new GameSolver();
	// int solution = ui.play(game);
	// System.out.println("The Answer Is " + solution);
	// System.out.println("The round you done this " + game.getCount());
	// }

	@Override
	public void start(Stage stage) {
		try {
			Parent root = (Parent) FXMLLoader.load(getClass().getResource("GuessingGameUI.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("GuessingGame");
			stage.sizeToScene();
			stage.setResizable(false);
			stage.show();
		} catch (Exception e) {
			System.out.println("Exception creating scen : " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		launch(args);
	}

}
