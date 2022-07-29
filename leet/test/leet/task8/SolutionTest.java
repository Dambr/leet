package leet.task8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution;
	
	@BeforeEach
	void setUp() {
		this.solution = new Solution();
	}
	
	@Test
	void ex1_test() {
		// Given
		String s = "42";
		
		// When
		int expected = 42;
		int actual = solution.myAtoi(s);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void ex2_test() {
		// Given
		String s = "   -42";
		
		// When
		int expected = -42;
		int actual = solution.myAtoi(s);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void ex3_test() {
		// Given
		String s = "4193 with words";
		
		// When
		int expected = 4193;
		int actual = solution.myAtoi(s);
		
		// Then
		assertEquals(expected, actual);
	}

}
