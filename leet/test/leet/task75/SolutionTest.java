package leet.task75;

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
		int[] nums = { 2, 0, 2, 1, 1, 0 };

		// When
		solution.sortColors(nums);

		// Then
		int[] expected = { 0, 0, 1, 1, 2, 2 };
		assertArrayEquals(expected, nums);
	}

	@Test
	void ex2Test() {
		// Given
		int[] nums = { 2, 0, 1 };

		// When
		solution.sortColors(nums);

		// Then
		int[] expected = { 0, 1, 2 };
		assertArrayEquals(expected, nums);
	}

}
