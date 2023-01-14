package leet.task6;

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
		int x = 121;
		
		// Then
		boolean expected = true;
		boolean actual = solution.isPalindrome(x);
		assertEquals(expected, actual);
	}
	
	@Test
	void ex2Test() {
		// Given
		int x = -121;
		
		// Then
		boolean expected = false;
		boolean actual = solution.isPalindrome(x);
		assertEquals(expected, actual);
	}
	
	@Test
	void ex3Test() {
		// Given
		int x = 10;
		
		// Then
		boolean expected = false;
		boolean actual = solution.isPalindrome(x);
		assertEquals(expected, actual);
	}
	
}
