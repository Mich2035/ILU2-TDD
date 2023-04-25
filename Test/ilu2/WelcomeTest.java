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
	@Test
	void EX3_test() {
		assertEquals("HELLO, JERRY",Welcome.welcome("JERRY"));
	}
	
	
	@Test
	void EX4_test() {
		assertEquals("Hello, Amy, Bob",Welcome.welcome("amy,bob"));
	}
	@Test
	void EX5_test() {
		assertEquals("Hello, Amy, Bob, Jerry",Welcome.welcome("amy,bob,jerry"));
	}
	@Test
	void EX6_test() {
		assertEquals("Hello, Amy, Jerry. AND HELLO, BOB !",Welcome.welcome("Amy, BOB, Jerry"));
	}
	
	@Test
	void EX7_test() {
		assertEquals("Hello, Bob, Amy and jerry",Welcome.welcome("bob,amy,jerry"));
	}
	
	@Test
	void EX8_test() {
		assertEquals("Hello, Bob, Amy and jerry",Welcome.welcome("bob   ,amy,jerry"));
	}
	
 
 

}
