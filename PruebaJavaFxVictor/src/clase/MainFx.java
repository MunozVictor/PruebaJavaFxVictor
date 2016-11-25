package clase;

import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainFx extends Application{
	private BorderPane rootLayout;
	public Stage primaryStage;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		try {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Prueba Profile Victor");
		this.primaryStage.setX(200);
		this.primaryStage.setY(200);

		primaryStage.show();
		
		initRootLayout();
		
	} catch(Exception e) {
		e.printStackTrace();
	}
		
	}

	private void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFx.class.getResource("../vista/Profile.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout, 600, 400);
			//scene.getStylesheets().add(getClass().getResource("mystylesheet.css").toExternalForm());

			// adding fonts
			scene.getStylesheets().add("mystylesheet.css");
			Font.loadFont(getClass().getResourceAsStream("../vista/fonts/HipsterishFontNormal.ttf"), 20);

			primaryStage.setScene(scene);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
