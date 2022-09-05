package leet.task34;

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
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;

		// Then
		int[] expected = { 3, 4 };
		int[] actual = solution.searchRange(nums, target);
		assertArrayEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 6;

		// Then
		int[] expected = { -1, -1 };
		int[] actual = solution.searchRange(nums, target);
		assertArrayEquals(expected, actual);
	}

	@Test
	void ex3Test() {
		// Given
		int[] nums = {};
		int target = 0;

		// Then
		int[] expected = { -1, -1 };
		int[] actual = solution.searchRange(nums, target);
		assertArrayEquals(expected, actual);
	}

}
