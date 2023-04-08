package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

// Classe responsável por controlar a tela
public class ViewController {

	@FXML
	private Button btnTest;  // Atributo correspondente ao controle visual (objeto da tela)
	
	// Método para tratar o evento principal do controle -> action (click)
	@FXML
	public void onBtnTestAction() {
		System.out.println("Click");
	}
}
