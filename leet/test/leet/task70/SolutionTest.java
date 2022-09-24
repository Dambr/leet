package leet.task70;

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
		int n = 2;

		// Then
		int expected = 2;
		int actual = solution.climbStairs(n);
		assertEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int n = 3;

		// Then
		int expected = 3;
		int actual = solution.climbStairs(n);
		assertEquals(expected, actual);
	}

}
