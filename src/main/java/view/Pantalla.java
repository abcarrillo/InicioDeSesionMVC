package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Pantalla extends GridPane {
	
	private TextField user;
	private PasswordField password;
	private Button enviar;
	private Button cancelar;
	
	public Pantalla() {
		super();
		
		user = new TextField();
		password = new PasswordField();
		enviar = new Button();
		enviar.setText("Enviar");
		cancelar = new Button();
		cancelar.setText("Cancelar");
		
		add(new Label("Usuario: "), 0, 0);
		add(user, 1, 0);
		add(new Label("Contraseña: "), 0, 1);
		add(password, 1, 1);
		add(enviar, 0, 2);
		add(cancelar, 1, 2);
		
		
		setPadding(new Insets(10, 10, 10, 10));
		setVgap(15);
		setHgap(45); 
		setAlignment(Pos.CENTER);
	}
	
	public TextField getUser() {
		return user;
	}

	public PasswordField getPassword() {
		return password;
	}

	public Button getCancelar() {
		return cancelar;
	}

	public Button getEnviar() {
		return enviar;
	}

}
