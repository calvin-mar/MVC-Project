package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.AdderModel;
import view.AdderController;


public class Main extends Application{
	@Override
	public void start(Stage stage) throws Exception{
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("../view/adderView.fxml"));
		Pane view = loader.load();
		
		AdderController controller = loader.getController();
		controller.setModel(new AdderModel());
		
		
		
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
