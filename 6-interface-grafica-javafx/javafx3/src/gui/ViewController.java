package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {

	@FXML
	private Button btnTest;
	
	@FXML
	public void onBtnTestAction() {
		Alerts.showAlert("Alert title", "Alert header", "Hello world!", AlertType.INFORMATION);
	}
}
