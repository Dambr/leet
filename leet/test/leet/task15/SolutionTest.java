package leet.task15;

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
		int[] nums = { -1, 0, 1, 2, -1, -4 };

		// Then
		List<List<Integer>> expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
		List<List<Integer>> actual = solution.threeSum(nums);
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int[] nums = { 0, 1, 1 };

		// Then
		List<List<Integer>> expected = List.of();
		List<List<Integer>> actual = solution.threeSum(nums);
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex3Test() {
		// Given
		int[] nums = { 0, 0, 0 };

		// Then
		List<List<Integer>> expected = List.of(List.of(0, 0, 0));
		List<List<Integer>> actual = solution.threeSum(nums);
		assertIterableEquals(expected, actual);
	}

}
