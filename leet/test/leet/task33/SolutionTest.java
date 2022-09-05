package leet.task33;

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
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;

		// Then
		int expectedValue = 4;
		int[] expectedArray = { 4, 5, 6, 7, 0, 1, 2 };

		int actualValue = solution.search(nums, target);
		int[] actualArray = nums;

		assertArrayEquals(expectedArray, actualArray);
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void ex2Test() {
		// Given
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 3;

		// Then
		int expectedValue = -1;
		int[] expectedArray = { 7, 0, 1, 2, 4, 5, 6 };

		int actualValue = solution.search(nums, target);
		int[] actualArray = nums;

		assertArrayEquals(expectedArray, actualArray);
		assertEquals(expectedValue, actualValue);
	}

	@Test
	void ex3Test() {
		// Given
		int[] nums = { 1 };
		int target = 0;

		// Then
		int expectedValue = -1;
		int[] expectedArray = { 1 };

		int actualValue = solution.search(nums, target);
		int[] actualArray = nums;

		assertArrayEquals(expectedArray, actualArray);
		assertEquals(expectedValue, actualValue);
	}

}
