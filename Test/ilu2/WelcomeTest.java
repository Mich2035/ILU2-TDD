package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 class  WelcomeTest {
	Welcome wel;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		assertEquals("Hello, Bob",wel.welcome("bob"));
	}

}
