package leet.task27;

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
		int[] nums = { 3, 2, 2, 3 };
		int val = 3;

		// When
		int k = solution.removeElement(nums, val);

		// Then
		int expectedK = 2;
		int[] expectedArray = { 2, 2 };
		assertAll(() -> assertEquals(expectedK, k), () -> assertEquals(expectedArray[0], nums[0]),
				() -> assertEquals(expectedArray[1], nums[1]));
	}

	@Test
	void ex2Test() {
		// Given
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;

		// When
		int k = solution.removeElement(nums, val);

		// Then
		int expectedK = 5;
		int[] expectedArray = { 0, 1, 3, 0, 4 };
		assertAll(() -> assertEquals(expectedK, k), () -> assertEquals(expectedArray[0], nums[0]),
				() -> assertEquals(expectedArray[1], nums[1]), () -> assertEquals(expectedArray[2], nums[2]),
				() -> assertEquals(expectedArray[3], nums[3]), () -> assertEquals(expectedArray[4], nums[4]));
	}

}
