package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController implements Initializable {

	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Label lblResult;
	
	@FXML
	private Button btnSum;
	
	@FXML
	public void onBtnSumAction() {
		try {
			Locale.setDefault(Locale.US);
			
			double number1 = Double.parseDouble(txtNumber1.getText());  // Armazena o valor do TextField na variável
			double number2 = Double.parseDouble(txtNumber2.getText());
			double sum = number1 + number2;
			
			lblResult.setText(String.format("%.2f", sum));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}
	}

	// Método executado quando o controlador for criado
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Constraints.setTextFieldDouble(txtNumber1);
		Constraints.setTextFieldDouble(txtNumber2);
		Constraints.setTextFieldMaxLength(txtNumber1, 7);
		Constraints.setTextFieldMaxLength(txtNumber2, 7);
	}
}
