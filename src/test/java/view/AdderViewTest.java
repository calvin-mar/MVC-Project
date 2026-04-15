package view;

import java.io.IOException;

//import org.assertj.core.api.Assertions;
import org.testfx.assertions.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.AdderModel;
import view.AdderController;

@ExtendWith(ApplicationExtension.class)
class AdderViewTest {

	@Start
	private void start(Stage stage){
		FXMLLoader loader = new FXMLLoader();
	    loader.setLocation(AdderModel.class
	        .getResource("../view/adderView.fxml"));
	    try {
	      Pane view = loader.load();
	      AdderController cont = loader.getController();
	      cont.setModel(new AdderModel());
	      
	      Scene s = new Scene(view);
	      stage.setScene(s);
	      stage.show();
	      
	      
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	}
	
	private void enterNums(FxRobot robot, String amt1, String amt2) {
		robot.doubleClickOn("#firstNumTextField");
		robot.write(amt1);
		robot.doubleClickOn("#secondNumTextField");
		robot.write(amt2);
	}
	
	private void checkAddNums(FxRobot robot, String amt1, String amt2, String sum) {
		enterNums(robot, amt1, amt2);
		robot.clickOn("#addButton");
		Assertions.assertThat(robot.lookup("#resultNumLabel").queryAs(Label.class)).hasText(sum);
	}
	
	@Test
	public void testAdditions(FxRobot robot) {
		checkAddNums(robot, "1", "2", "3");
		checkAddNums(robot, "3", "5", "8");
		checkAddNums(robot, "10", "12", "22");
		checkAddNums(robot, "3.1", "2.5", "5.6");
	}
}
