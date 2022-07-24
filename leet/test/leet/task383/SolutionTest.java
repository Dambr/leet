package leet.task383;

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
	void negativeTestWith2DifferentLetters() {
		// Given
		String ransomNote = "a";
		String magazine = "b";
		
		// When
		boolean expected = false;
		boolean actual = solution.canConstruct(ransomNote, magazine);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void negativeTestWith1SameAnd2DifferentLetters() {
		// Given
		String ransomNote = "aa";
		String magazine = "ab";
		
		// When
		boolean expected = false;
		boolean actual = solution.canConstruct(ransomNote, magazine);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void positiveTestWith2SameAnd1ExtraLetters() {
		// Given
		String ransomNote = "aa";
		String magazine = "aab";
		
		// When
		boolean expected = true;
		boolean actual = solution.canConstruct(ransomNote, magazine);
		
		// Then
		assertEquals(expected, actual);
	}
	
}
