package leet.task28;

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
	void ex1Test() {
		// Given
		String haystack = "sadbutsad";
		String needle = "sad";
		
		// Then
		int expected = 0;
		int actual = solution.strStr(haystack, needle);
		assertEquals(expected, actual);
	}
	
	@Test
	void ex2Test() {
		// Given
		String haystack = "leetcode";
		String needle = "leeto";
		
		// Then
		int expected = -1;
		int actual = solution.strStr(haystack, needle);
		assertEquals(expected, actual);
	}

}
