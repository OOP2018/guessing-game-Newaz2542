package gameUI;
import java.util.Observable;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
/**
 * This class for create another window of application that show the user count of playing.
 * @author Vichakorn
 *
 */
public class CounterView implements java.util.Observer {
	private Stage stage;
	private Label label;
	private NumberGame game;
	
	public CounterView(NumberGame game) {
		this.game = game;
		initComponents();
	}
	private void initComponents() {
		stage = new Stage();
		// components and containers for our window
		HBox root = new HBox();
		// TODO Set some padding around the HBox
		root.setPadding(new Insets(10));
		// TODO Align components in center of the HBox
		root.setAlignment(Pos.CENTER);
		// The label that will show the counter value.
		label = new Label("   ");
		// make the label big enough
		label.setPrefWidth(250);
		// TODO Make the text BIG. Use setFont to create a font.
		// TODO Be careful to import the correct Font class (not java.awt.Font).
		label.setFont(new Font("Arial", 80.0));
		// TODO Set the text alignment to CENTER
		label.setAlignment(Pos.CENTER);
		// Add the label to the HBox. You can all more components, too.
		root.getChildren().add(label);
		// Create a Scene using HBox as the root element
		Scene scene = new Scene(root);
		// show the scene on the stage
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Count");
		stage.sizeToScene();
	}

	/** Show the window and update the counter value. */
	public void run() {
		stage.show();
		displayCount();
	}
	public void displayCount() {
		label.setText( String.format("%2d", game.getCount()) );
	}

	@Override
	public void update(Observable o, Object arg) {
		displayCount();
	}	
}
