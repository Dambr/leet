package leet.task50;

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
		double x = 2.00000;
		int n = 10;

		// Then
		double expected = 1024;
		double actual = solution.myPow(x, n);
		assertEquals(expected, actual, 0);
	}

	@Test
	void ex2Test() {
		// Given
		double x = 2.10000;
		int n = 3;

		// Then
		double expected = 9.261;
		double actual = solution.myPow(x, n);
		assertEquals(expected, actual, 3);
	}

	@Test
	void ex3Test() {
		// Given
		double x = 2.00000;
		int n = -2;

		// Then
		double expected = 0.25;
		double actual = solution.myPow(x, n);
		assertEquals(expected, actual, 2);
	}
	
	@Test
	void wrong1() {
		// Given
		double x = 2.00000;
		int n = -2147483648;
		
		// Then
		double expected = 0;
		double actual = solution.myPow(x, n);
		assertEquals(expected, actual);
	}

}
