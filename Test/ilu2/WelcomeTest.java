package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 class  WelcomeTest {
	



	@Test
	void EX1_test() {
		assertEquals("Hello, Bob",Welcome.welcome("bob"));
		assertEquals("Hello, Jean",Welcome.welcome("jean"));
		assertEquals("Hello, Loris",Welcome.welcome("loris"));
		assertEquals("Hello, Michele",Welcome.welcome("michele"));
	}
	@Test
	void EX2_test() {
		assertEquals("Hello, my friend",Welcome.welcome(" "));
		assertEquals("Hello, my friend",Welcome.welcome("             "));
	}
	@Test
	void EX3_test() {
		assertEquals("HELLO, JERRY",Welcome.welcome("JERRY"));
		assertEquals("HELLO, JEAN",Welcome.welcome("JEAN"));
		assertEquals("HELLO, LORIS",Welcome.welcome("LORIS"));
		assertEquals("HELLO, MICHELE",Welcome.welcome("MICHELE"));
	}
	
	
	@Test
	void EX4_test() {
		assertEquals("Hello, Amy, Bob",Welcome.welcome("amy,bob"));
		assertEquals("Hello, Enea, Loris",Welcome.welcome("enea,loris"));
		assertEquals("Hello, Ania, Bobily",Welcome.welcome("ania,bobily"));
		assertEquals("Hello, Erna, Pilo",Welcome.welcome("erna,pilo"));
	}
	@Test
	void EX5_test() {
		assertEquals("Hello, Amy, Bob, Jerry",Welcome.welcome("amy,bob,jerry"));
		assertEquals("Hello, Enea, Loris, Pilo",Welcome.welcome("enea,loris,pilo"));
		assertEquals("Hello, Amina, Pilo, Naomie",Welcome.welcome("amina,pilo,naomie"));
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
	
	@Test
	void EX9_test() {
		assertEquals("Hello, Bob (x3), and Amy. AND HELLO JERRY (x2)",Welcome.welcome("bob, JERRY, amy, bob, JERRY, bob"));
		
	}
	
	@Test
	void EX10_test() {
		assertEquals("Bob, Yoda, and Amy,Hello. AND HELLO JERRY",Welcome.welcome("bob, yoda, amy, JERRY"));
		
	}
	
	
 
 

}
