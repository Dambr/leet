package leet.task62;

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
		int m = 3;
		int n = 7;

		// Then
		int expected = 28;
		int actual = solution.uniquePaths(m, n);
		assertEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int m = 3;
		int n = 2;

		// Then
		int expected = 3;
		int actual = solution.uniquePaths(m, n);
		assertEquals(expected, actual);
	}

}
