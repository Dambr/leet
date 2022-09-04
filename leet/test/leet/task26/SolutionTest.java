package leet.task26;

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
		int[] nums = { 1, 1, 2 };

		// Then
		int expected = 2;
		int actual = solution.removeDuplicates(nums);
		assertEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		// Then
		int expected = 5;
		int actual = solution.removeDuplicates(nums);
		assertEquals(expected, actual);
	}

}
