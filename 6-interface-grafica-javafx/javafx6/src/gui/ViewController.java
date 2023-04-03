package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {

	@FXML
	private ComboBox<Person> cbxPerson;
	
	@FXML
	private Button btnAll;
	
	private ObservableList<Person> obsList;  // Tipo especial de lista associadada com o componente visual
	
	@FXML
	public void onBtnAllAction() {
		cbxPerson.getItems().forEach(x -> System.out.println(x));
	}
	
	@FXML
	public void onCbxPersonAction() {
		Person person = cbxPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		List<Person> list = new ArrayList<>();
		list.addAll(Arrays.asList(new Person(1, "Maria", "maria@gmail.com"), new Person(2, "Alex", "alex@gmail.com"), new Person(3, "Bob", "bob@gmail.com")));
		
		obsList = FXCollections.observableArrayList(list);  // Instancia a ObservableList com os elementos de list
		cbxPerson.setItems(obsList);  // Carrega os elementos no ComboBox
		
		// Define a customização dos itens exibidos no ComboBox -> name
		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			}
		};
		
		cbxPerson.setCellFactory(factory);
		cbxPerson.setButtonCell(factory.call(null));
	}
}
