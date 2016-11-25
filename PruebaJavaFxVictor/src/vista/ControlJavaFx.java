package vista;

import java.io.IOException;


import clase.MainFx;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlJavaFx {
	
	public void sendStage() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainFx.class.getResource("../vista/Send.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("Edit profile");
            Scene scene = new Scene(page);
            sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	public void closeStage(){
		handleClose();
	}
	
    /**
     * Method to handle the AnchorPane action in the Main stage 
     * @see sendStage
     */
    
    @FXML
    private void handleSend() {
    	sendStage();
    }

    /**
     * Closes the application when clicked on "View in GitHub" in the first stage
     */
    @FXML
    private void handleClose() {
   	        System.exit(0);
    }

}
