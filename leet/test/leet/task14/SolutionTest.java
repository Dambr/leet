package leet.task14;

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
		String[] strs = { "flower", "flow", "flight" };

		// When
		String expected = "fl";
		String actual = solution.longestCommonPrefix(strs);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	void ex2_test() {
		// Given
		String[] strs = { "dog", "racecar", "car" };
		
		// When
		String expected = "";
		String actual = solution.longestCommonPrefix(strs);
		
		// Then
		assertEquals(expected, actual);
	}

}
