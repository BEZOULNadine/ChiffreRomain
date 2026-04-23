package Chiffreromain;

public class Game {
	String mot = "";

	public String play(int nombre) {
		if (nombre > 3999 || nombre <= 0) {
			throw new IllegalArgumentException("Nombre invalide" + nombre);
		}
		if (nombre == 4) {
			return "IV";
		}
		for (int i = 0; i < nombre; i++) {
			mot += "I";

		}
		return mot;
	}

}
