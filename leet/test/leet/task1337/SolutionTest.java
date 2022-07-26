package leet.task1337;

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
	void ex1_test() {
		// Given
		int[][] mat = {
				{1, 1, 0, 0, 0},
				{1, 1, 1, 1, 0},
				{1, 0, 0, 0, 0},
				{1, 1, 0, 0, 0},
				{1, 1, 1, 1, 1}
		};
		int k = 3;
		
		// When
		int[] expected = {2, 0, 3};
		int[] actual = solution.kWeakestRows(mat, k);
		
		// Then
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void ex2_test() {
		// Given
		int[][] mat = {
				{1, 0, 0, 0},
				{1, 1, 1, 1},
				{1, 0, 0, 0},
				{1, 0, 0, 0}
		};
		int k = 2;
		
		// When
		int[] expected = {0, 2};
		int[] actual = solution.kWeakestRows(mat, k);
		
		// Then
		assertArrayEquals(expected, actual);
	}

}
