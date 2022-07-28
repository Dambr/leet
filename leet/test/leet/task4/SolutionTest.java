package leet.task4;

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
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2 };

		// When
		double expected = 2;
		double actual = solution.findMedianSortedArrays(nums1, nums2);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	void ex2_test() {
		// Given
		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3, 4 };

		// When
		double expected = 2.5;
		double actual = solution.findMedianSortedArrays(nums1, nums2);

		// Then
		assertEquals(expected, actual);
	}

}
