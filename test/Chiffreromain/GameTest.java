package Chiffreromain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
	Game Gm;

	@BeforeEach
	void setUp() throws Exception {
		Gm = new Game();
	}

	@Test
	void Iter1() {
		assertEquals(Gm.play(1), "I");
	}

	@Test
	void Iter2() {
		assertEquals(Gm.play(2), "II");
	}

	@Test
	void Iter3() {
		assertEquals(Gm.play(3), "III");
	}

	@Test
	void Iter4_1() {
		assertThrows(IllegalArgumentException.class, () -> Gm.play(0));

	}

	@Test
	void Iter4_2() {
		assertThrows(IllegalArgumentException.class, () -> Gm.play(-1));

	}

	@Test
	void Iter4_3() {
		assertThrows(IllegalArgumentException.class, () -> Gm.play(50000));

	}

	@Test
	void Iter5() {
		assertEquals(Gm.play(4), "IV");
	}

	@Test
	void Iter6() {
		assertEquals(Gm.play(5), "V");
	}

	@Test
	void Iter7() {
		assertEquals(Gm.play(9), "IX");
	}

	@Test
	void dix_donne_X() {
		assertEquals("XI", Gm.play(11));
	}

	@Test
	void trente_donne_XXX() {
		assertEquals("XXXIV", Gm.play(34));
	}

	@Test
	void Iter9() {
		assertEquals(Gm.play(100), "C");
	}

	@Test
	void Iter10() {
		assertEquals(Gm.play(2000), "MM");
	}

	// nexttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt
	@Test
	void Iter11() {
		assertEquals(Gm.play(1994), "MCMXCIV");
	}

	@Test
	void Iter12() {
		assertEquals(Gm.play(2024), "MMXXIV");
	}

	@Test
	void Iter13() {
		assertEquals(Gm.play(3999), "MMMCMXCIX");
	}

	@Test
	void Iter14() {
		assertEquals(Gm.play(58), "LVIII");
	}

	@Test
	void Iter15() {
		assertEquals(Gm.play(648), "DCXLVIII");
	}

}
