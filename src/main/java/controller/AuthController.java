package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.Validator;
import view.Pantalla;

public class AuthController {
	private Pantalla pantalla = new Pantalla();
	private Validator validador = new Validator();

	public AuthController() {

		pantalla.getEnviar().setOnAction(e -> {
			try {
				onEnviarAction(e);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		;
	}

	private void onEnviarAction(ActionEvent e) throws IOException {
		boolean resultado = validador.validarAcceso(pantalla.getUser().getText(), pantalla.getPassword().getText());
		String texto = "";
		Alert a = new Alert(AlertType.INFORMATION);
		if(resultado) {
			texto = "Las credenciales de acceso son válidas";
		}else {
			texto = "Las credenciales no son válidas";
			a.setAlertType(AlertType.ERROR);
		}
		
		a.setContentText(texto);
		a.show();
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public Validator getValidador() {
		return validador;
	}

}
