package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Button btnSum;
	
	@FXML
	private Label lblResult;
	
	@FXML
	public void onBtnSumAction() {
		try {
			Locale.setDefault(Locale.US);
			
			double number1 = Double.parseDouble(txtNumber1.getText());  // Armazena o valor do TextField na variável
			double number2 = Double.parseDouble(txtNumber2.getText());
			double sum = number1 + number2;
			
			lblResult.setText(String.format("%.2f", sum));
		}
		catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}
	}
}