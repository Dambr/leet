package leet.task20;

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
		String s = "()";

		// Then
		boolean expected = true;
		boolean actual = solution.isValid(s);
		assertEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		String s = "()[]{}";

		// Then
		boolean expected = true;
		boolean actual = solution.isValid(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void ex3Test() {
		// Given
		String s = "(]";

		// Then
		boolean expected = false;
		boolean actual = solution.isValid(s);
		assertEquals(expected, actual);
	}

}
