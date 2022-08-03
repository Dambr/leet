package leet.task10;

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
		String s = "aa";
		String p = "a";
		
		// When
		boolean expected = false;
		boolean actual = solution.isMatch(s, p);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void ex2_test() {
		// Given
		String s = "aa";
		String p = "a*";
		
		// When
		boolean expected = true;
		boolean actual = solution.isMatch(s, p);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void ex3_test() {
		// Given
		String s = "ab";
		String p = ".*";
		
		// When
		boolean expected = true;
		boolean actual = solution.isMatch(s, p);
		
		// Then
		assertEquals(expected, actual);
	}

}
