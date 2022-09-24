package leet.task54;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

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
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Then
		List<Integer> expected = List.of(1, 2, 3, 6, 9, 8, 7, 4, 5);
		List<Integer> actual = solution.spiralOrder(matrix);
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		// Then
		List<Integer> expected = List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
		List<Integer> actual = solution.spiralOrder(matrix);
		assertIterableEquals(expected, actual);
	}

}
