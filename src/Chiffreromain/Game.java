package Chiffreromain;

public class Game {

	public String play(int nombre) {
		String mot = "";
		if (nombre > 3999 || nombre <= 0) {
			throw new IllegalArgumentException("Nombre invalide" + nombre);
		}
		if (nombre == 4) {
			mot += "IV";
			nombre -= 4;
		}
		if (nombre == 5) {
			mot += "V";
			nombre -= 5;
		}
		if (nombre == 9) {
			mot += "IX";
			nombre -= 9;
		}

		while (nombre >= 1) {
			mot += "I";
			nombre--;

		}
		return mot;
	}

}
