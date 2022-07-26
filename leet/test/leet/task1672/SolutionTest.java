package leet.task1672;

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
		int[][] accounts = {
				{1, 2, 3},
				{3, 2, 1}
		};
		
		// When
		int expected = 6;
		int actual = solution.maximumWealth(accounts);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void ex2_test() {
		// Given
		int[][] accounts = {
				{1, 5},
				{7, 3},
				{3, 5}
		};
		
		// When
		int expected = 10;
		int actual = solution.maximumWealth(accounts);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void ex3_test() {
		// Given
		int[][] accounts = {
				{2, 8, 7},
				{7, 1, 3},
				{1, 9, 5}
		};
		
		// When
		int expected = 17;
		int actual = solution.maximumWealth(accounts);
		
		// Then
		assertEquals(expected, actual);
	}

}
