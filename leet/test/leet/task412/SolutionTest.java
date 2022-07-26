package leet.task412;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

	private Solution solution;
	
	@BeforeEach
	void setUp() {
		this.solution = new Solution();
	}
	
	@Test
	void n3_test() {
		// Given
		int n = 3;
		
		// When
		List<String> expected = List.of("1","2","Fizz");
		List<String> actual = solution.fizzBuzz(n);
		
		// Then
		assertIterableEquals(expected, actual);
	}
	
	@Test
	void n5_test() {
		// Given
		int n = 5;
		
		// When
		List<String> expected = List.of("1","2","Fizz","4","Buzz");
		List<String> actual = solution.fizzBuzz(n);
		
		// Then
		assertIterableEquals(expected, actual);
	}
	
	@Test
	void n15_test() {
		// Geven
		int n = 15;
		
		// When
		List<String> expected = List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
		List<String> actual = solution.fizzBuzz(n);
		
		// Then
		assertIterableEquals(expected, actual);
	}

}
