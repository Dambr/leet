package leet.task1342;

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
	void num14_test() {
		// Given
		int num = 14;
		
		// When
		int expected = 6;
		int actual = solution.numberOfSteps(num);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void num8_test() {
		// Given
		int num = 8;
		
		// When
		int expected = 4;
		int actual = solution.numberOfSteps(num);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void num123_test() {
		// Given
		int num = 123;
		
		// When
		int expected = 12;
		int actual = solution.numberOfSteps(num);
		
		// Then
		assertEquals(expected, actual);
	}

}
