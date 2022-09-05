package leet.task29;

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
		int dividend = 10;
		int divisor = 3;

		// Then
		int expected = 3;
		int actual = solution.divide(dividend, divisor);
		assertEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int dividend = 7;
		int divisor = -3;

		// Then
		int expected = -2;
		int actual = solution.divide(dividend, divisor);
		assertEquals(expected, actual);
	}

}
