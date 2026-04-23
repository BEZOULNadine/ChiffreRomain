package Chiffreromain;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		;
	}

	@Test
	void Iter2() {
		assertEquals(Gm.play(2), "II");
		;
	}

	@Test
	void Iter3() {
		assertEquals(Gm.play(3), "III");
		;
	}

}
