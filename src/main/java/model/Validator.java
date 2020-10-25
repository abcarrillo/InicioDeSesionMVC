package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;

public class Validator {
	public boolean validarAcceso(String user, String pass) throws IOException {
		boolean resultado = false;
		
		String md5 = DigestUtils.md5Hex(pass).toUpperCase();
		Path path = Paths.get("src/main/resources/users/users.csv");
		List<String> lines = Files.readAllLines(path);
		
		for (String string : lines) {
			String auth[] = string.split(",");
			System.out.println(auth[0] + " | " + auth[1]);
			if(auth[0].equals(user) && auth[1].equals(md5)) {
				resultado = true;
				break;
			}
		}

		return resultado;
	}
}
