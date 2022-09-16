package leet.task49;

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
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

		// Then
		List<List<String>> expected = List.of(List.of("eat", "tea", "ate"), List.of("tan", "nat"), List.of("bat"));
		List<List<String>> actual = solution.groupAnagrams(strs);
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		String[] strs = { "" };

		// Then
		List<List<String>> expected = List.of(List.of(""));
		List<List<String>> actual = solution.groupAnagrams(strs);
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex3Test() {
		// Given
		String[] strs = { "a" };

		// Then
		List<List<String>> expected = List.of(List.of("a"));
		List<List<String>> actual = solution.groupAnagrams(strs);
		assertIterableEquals(expected, actual);
	}

}
