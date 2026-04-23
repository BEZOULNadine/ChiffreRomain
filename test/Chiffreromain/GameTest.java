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
		;
	}

	@Test
	void Iter4_2() {
		assertThrows(IllegalArgumentException.class, () -> Gm.play(-1));
		;
	}

	@Test
	void Iter4_3() {
		assertThrows(IllegalArgumentException.class, () -> Gm.play(50000));
		;
	}

}
