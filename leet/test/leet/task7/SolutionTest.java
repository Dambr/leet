package leet.task7;

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
		int x = 123;
		
		// When
		int expected = 321;
		int actual = solution.reverse(x);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void ex2_test() {
		// Given
		int x = -123;
		
		// When
		int expected = -321;
		int actual = solution.reverse(x);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void ex3_test() {
		// Given
		int x = 120;
		
		// When
		int expected = 21;
		int actual = solution.reverse(x);
		
		// Then
		assertEquals(expected, actual);
	}

}
