package leet.task56;

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
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

		// Then
		int[][] expected = { { 1, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] actual = solution.merge(intervals);
		assertArrayEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int[][] intervals = { { 1, 4 }, { 4, 5 } };

		// Then
		int[][] expected = { { 1, 5 } };
		int[][] actual = solution.merge(intervals);
		assertArrayEquals(expected, actual);
	}

}
