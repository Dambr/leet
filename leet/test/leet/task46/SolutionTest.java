package leet.task46;

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
		int[] nums = { 1, 2, 3 };

		// Then
		List<List<Integer>> expected = List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1),
				List.of(3, 2, 1), List.of(3, 1, 2));
		List<List<Integer>> actual = solution.permute(nums);
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int[] nums = { 0, 1 };

		// Then
		List<List<Integer>> expected = List.of(List.of(0, 1), List.of(1, 0));
		List<List<Integer>> actual = solution.permute(nums);
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex3Test() {
		// Given
		int[] nums = { 1 };

		// Then
		List<List<Integer>> expected = List.of(List.of(1));
		List<List<Integer>> actual = solution.permute(nums);
		assertIterableEquals(expected, actual);
	}

}
