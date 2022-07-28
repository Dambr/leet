package leet.task3;

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
		String s = "abcabcbb";
		
		// When
		int expected = 3;
		int actual = solution.lengthOfLongestSubstring(s);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void ex2_test() {
		// Given
		String s = "bbbbb";
		
		// When
		int expected = 1;
		int actual = solution.lengthOfLongestSubstring(s);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void ex3_test() {
		// Given
		String s = "pwwkew";
		
		// When
		int expected = 3;
		int actual = solution.lengthOfLongestSubstring(s);
		
		// Then
		assertEquals(expected, actual);
	}

}
