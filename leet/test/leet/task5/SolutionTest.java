package leet.task5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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
		String s = "babad";
		
		// When
		List<String> expected = List.of("bab", "aba");
		String actual = solution.longestPalindrome(s);
		
		// Then
		assertEquals(true, expected.contains(actual));
	}
	
	@Test
	void ex2_test() {
		// Given
		String s = "cbbd";
		
		// When
		String expected = "bb";
		String actual = solution.longestPalindrome(s);
		
		// Then
		assertEquals(expected, actual);
	}

}
