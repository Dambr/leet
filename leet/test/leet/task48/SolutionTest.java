package leet.task48;

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
		int[][] matrix = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
				};

		// When
		solution.rotate(matrix);

		// Then
		int[][] expected = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
		assertArrayEquals(expected, matrix);
	}

	@Test
	void ex2Test() {
		// Given
		int[][] matrix = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };

		// When
		solution.rotate(matrix);

		// Then
		int[][] expected = { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } };
		assertArrayEquals(expected, matrix);
	}

}
