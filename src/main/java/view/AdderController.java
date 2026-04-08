package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.AdderModel;

public class AdderController {
	
	AdderModel model;
	
	public void setModel(AdderModel model) {
		this.model = model;
	}
	
    @FXML
    private TextField firstNumTextField;

    @FXML
    private Label resultNumLabel;

    @FXML
    private TextField secondNumTextField;

    @FXML
    void onAddButton(ActionEvent event) {

    }

}
