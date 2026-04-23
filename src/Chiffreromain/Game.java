package Chiffreromain;

public class Game {
	int chiffrenormal[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	String chiffreroman[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public String play(int nombre) {
		String mot = "";
		if (nombre > 3999 || nombre <= 0) {
			throw new IllegalArgumentException("Nombre invalide" + nombre);

		}
		for (int i = 0; i < chiffrenormal.length; i++) {
			while (chiffrenormal[i] <= nombre) {
				mot += chiffreroman[i];
				nombre -= chiffrenormal[i];
			}

		}
		return mot;
	}
}
