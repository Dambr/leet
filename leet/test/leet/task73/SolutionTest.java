package leet.task73;

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
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		// When
		solution.setZeroes(matrix);

		// Then
		int[][] expected = { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } };
		assertArrayEquals(expected, matrix);
	}

	@Test
	void ex2Test() {
		// Given
		int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

		// When
		solution.setZeroes(matrix);

		// Then
		int[][] expected = { { 0, 0, 0, 0 }, { 0, 4, 5, 0 }, { 0, 3, 1, 0 } };
		assertArrayEquals(expected, matrix);
	}

}
