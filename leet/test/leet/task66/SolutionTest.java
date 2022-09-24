package leet.task66;

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
		int[] digits = { 1, 2, 3 };

		// Then
		int[] expected = { 1, 2, 4 };
		int[] actual = solution.plusOne(digits);
		assertArrayEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int[] digits = { 4, 3, 2, 1 };

		// Then
		int[] expected = { 4, 3, 2, 2 };
		int[] actual = solution.plusOne(digits);
		assertArrayEquals(expected, actual);
	}

	@Test
	void ex3Test() {
		// Given
		int[] digits = { 9 };

		// Then
		int[] expected = { 1, 0 };
		int[] actual = solution.plusOne(digits);
		assertArrayEquals(expected, actual);
	}

}
