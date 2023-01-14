package leet.task12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution;
	
	@BeforeEach
	void setUp() {
		this.solution = new Solution();
	}
	
	@Test
	void ex1Test() {
		// Given
		int num = 3;
		
		// Then
		String expected = "III";
		String actual = solution.intToRoman(num);
		assertEquals(expected, actual);
	}
	
	@Test
	void ex2Test() {
		// Given
		int num = 58;
		
		// Then
		String expected = "LVIII";
		String actual = solution.intToRoman(num);
		assertEquals(expected, actual);
	}
	
	@Test
	void ex3Test() {
		// Given
		int num = 1994;
		
		// Then
		String expected = "MCMXCIV";
		String actual = solution.intToRoman(num);
		assertEquals(expected, actual);
	}
	
	@Test
	void ex10Test() {
		// Given
		int num = 10;
		
		// Then
		String expected = "X";
		String actual = solution.intToRoman(num);
		assertEquals(expected, actual);
	}
	
	@Test
	void ex20Test() {
		// Given
		int num = 20;
		
		// Then
		String expected = "XX";
		String actual = solution.intToRoman(num);
		assertEquals(expected, actual);
	}
	
}
