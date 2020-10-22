package view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Pantalla extends GridPane {
	
	private TextField user;
	private PasswordField password;
	
	public Pantalla() {
		super();
		
		user = new TextField();
		password = new PasswordField();
		
		add(new Label("Nombre de usuario:"), 0, 0);
		add(new Label("Password:"), 0, 1);
		add(user, 1, 0);
		add(password, 1, 1);
		setAlignment(Pos.BASELINE_CENTER);
	}
}
