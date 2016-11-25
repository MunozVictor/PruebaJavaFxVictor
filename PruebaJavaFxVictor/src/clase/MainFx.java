package clase;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * This class extends Application, it initializes the application with a
 * BorderPane that is the main window
 * 
 * @author: Victor Muñoz
 * @version: 25-11-2016
 */
public class MainFx extends Application {
	private BorderPane rootLayout;
	public Stage primaryStage;

	/**
	 * Main launch arguments
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);

	}

	/**
	 * Starts the first Stage and initializes the Borderpane
	 * 
	 * @see initRootLayout
	 */

	@Override
	public void start(Stage primaryStage) throws Exception {

		try {

			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Prueba Profile Victor");
			this.primaryStage.setX(200);
			this.primaryStage.setY(200);

			primaryStage.show();

			initRootLayout();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Method that launches the BorderPane from Profile.fxml and add fonts
	 */
	private void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFx.class.getResource("../vista/Profile.fxml"));
			rootLayout = (BorderPane) loader.load();
			Scene scene = new Scene(rootLayout, 600, 400);
			scene.getStylesheets().add(getClass().getResource("../vista/mystylesheet.css").toExternalForm());

			scene.getStylesheets().add("./vista/mystylesheet.css");
			Font.loadFont(getClass().getResourceAsStream("../vista/fonts/HipsterishFontNormal.ttf"), 20);

			primaryStage.setScene(scene);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
