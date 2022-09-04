package leet.task22;

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
	void ex1Test() {
		// Given
		int n = 3;

		// Then
		List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
		List<String> actual = solution.generateParenthesis(n);
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		int n = 1;

		// Then
		List<String> expected = List.of("()");
		List<String> actual = solution.generateParenthesis(n);
		assertIterableEquals(expected, actual);
	}

}
