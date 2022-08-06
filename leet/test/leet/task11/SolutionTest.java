package leet.task11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution;

	@BeforeEach
	void setUp() {
		this.solution = new Solution();
	}

	@Test
	void ex1_test() {
		// Given
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		// When
		int expected = 49;
		int actual = solution.maxArea(height);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	void ex2_test() {
		// Given
		int[] height = { 1, 1 };

		// When
		int expected = 1;
		int actual = solution.maxArea(height);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	void bug1_test() {
		// Given
		int[] height = { 1, 2 };

		// When
		int expected = 1;
		int actual = solution.maxArea(height);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	void bug2_test() {
		// Given
		int[] height = { 1, 2, 1 };

		// When
		int expected = 2;
		int actual = solution.maxArea(height);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	void bug3_test() {
		// Given
		int[] height = { 1, 2, 4, 3 };

		// When
		int expected = 4;
		int actual = solution.maxArea(height);

		// Then
		assertEquals(expected, actual);
	}

}
