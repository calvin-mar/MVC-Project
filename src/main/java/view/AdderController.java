package view;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import model.AdderModel;
import javafx.util.converter.*;

public class AdderController {
	
	AdderModel model;
	
	
	public void setModel(AdderModel model) {
		this.model = model;
		
		StringConverter<Number> fmt = new NumberStringConverter();
		Bindings.bindBidirectional(resultNumLabel.textProperty(), model.getResultNum(), fmt);
	}
	



	@FXML
    private TextField firstNumTextField;

    @FXML
    private Label resultNumLabel;

    @FXML
    private TextField secondNumTextField;

    @FXML
    void onAddButton(ActionEvent event) {
    	model.addNumbers(Double.parseDouble(firstNumTextField.getText()), Double.parseDouble(secondNumTextField.getText()));
    }

}
