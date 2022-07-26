package leet.task1;

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
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		// When
		int[] expected = {0, 1};
		int[] actual = solution.twoSum(nums, target);
		
		// Then
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void ex2_test() {
		// Given
		int[] nums = {3, 2, 4};
		int target = 6;
		
		// When
		int[] expected = {1, 2};
		int[] actual = solution.twoSum(nums, target);
		
		// Then
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void ex3_test() {
		// Given
		int[] nums = {3, 3};
		int target = 6;
		
		// When
		int[] expected = {0, 1};
		int[] actual = solution.twoSum(nums, target);
		
		// Then
		assertArrayEquals(expected, actual);
	}

}
