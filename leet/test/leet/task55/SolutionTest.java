package leet.task55;

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
		int[] nums = { 2, 3, 1, 1, 4 };

		// Then
		boolean expected = true;
		boolean actual = solution.canJump(nums);
		assertEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int[] nums = { 3, 2, 1, 0, 4 };

		// Then
		boolean expected = false;
		boolean actual = solution.canJump(nums);
		assertEquals(expected, actual);
	}

}
