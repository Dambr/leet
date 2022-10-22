package leet.task88;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

	private Solution solution;

	@BeforeEach
	void setUp() {
		this.solution = new Solution();
	}

	@Test
	void ex1Test() {
		// Given
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;

		// When
		solution.merge(nums1, m, nums2, n);

		// Then
		int[] expected = { 1, 2, 2, 3, 5, 6 };
		int[] actual = nums1;
		assertArrayEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int[] nums1 = { 1 };
		int m = 1;
		int[] nums2 = {};
		int n = 0;

		// When
		solution.merge(nums1, m, nums2, n);

		// Then
		int[] expected = { 1 };
		int[] actual = nums1;
		assertArrayEquals(expected, actual);
	}

	@Test
	void ex3Test() {
		// Given
		int[] nums1 = { 0 };
		int m = 0;
		int[] nums2 = { 1 };
		int n = 1;

		// When
		solution.merge(nums1, m, nums2, n);

		// Then
		int[] expected = { 1 };
		int[] actual = nums1;
		assertArrayEquals(expected, actual);
	}

}
