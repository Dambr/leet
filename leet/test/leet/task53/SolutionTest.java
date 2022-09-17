package leet.task53;

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
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		// Then
		int expected = 6;
		int actual = solution.maxSubArray(nums);
		assertEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int[] nums = { 1 };

		// Then
		int expected = 1;
		int actual = solution.maxSubArray(nums);
		assertEquals(expected, actual);
	}

	@Test
	void ex3Test() {
		// Given
		int[] nums = { 5, 4, -1, 7, 8 };

		// Then
		int expected = 23;
		int actual = solution.maxSubArray(nums);
		assertEquals(expected, actual);
	}

}
