package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 class  WelcomeTest {
	



	@Test
	void EX1_test() {
		assertEquals("Hello, Bob",Welcome.welcome("bob"));
	}
	@Test
	void EX2_test() {
		assertEquals("Hello, my friend",Welcome.welcome(" "));
	}


}
