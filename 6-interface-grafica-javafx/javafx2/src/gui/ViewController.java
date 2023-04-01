package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

// Classe responsável por controlar a tela
public class ViewController {

	@FXML  // Atributo correspondente ao controle visual (objeto da tela)
	private Button btnTest;
	
	@FXML  // Método para tratar o evento do controle -> Evento principal: click/action
	public void onBtnTestAction() {
		System.out.println("Click");
	}
}
