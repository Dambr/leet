package leet.task41;

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
		int[] nums = { 1, 2, 0 };

		// Then
		int expected = 3;
		int actual = solution.firstMissingPositive(nums);
		assertEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int[] nums = { 3, 4, -1, 1 };

		// Then
		int expected = 2;
		int actual = solution.firstMissingPositive(nums);
		assertEquals(expected, actual);
	}

	@Test
	void ex3Test() {
		// Given
		int[] nums = { 7, 8, 9, 11, 12 };

		// Then
		int expected = 1;
		int actual = solution.firstMissingPositive(nums);
		assertEquals(expected, actual);
	}

}
