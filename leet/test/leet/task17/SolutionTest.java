package leet.task17;

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
	void ex1Test() {
		// Given
		String digits = "23";

		// Then
		List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
		List<String> actual = solution.letterCombinations(digits);
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		String digits = "";

		// Then
		List<String> expected = List.of();
		List<String> actual = solution.letterCombinations(digits);
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex3Test() {
		// Given
		String digits = "2";

		// Then
		List<String> expected = List.of("a", "b", "c");
		List<String> actual = solution.letterCombinations(digits);
		assertIterableEquals(expected, actual);
	}

}
