package leet.task69;

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
		int x = 4;

		// Then
		int expected = 2;
		int actual = solution.mySqrt(x);
		assertEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int x = 8;

		// Then
		int expected = 2;
		int actual = solution.mySqrt(x);
		assertEquals(expected, actual);
	}

}
