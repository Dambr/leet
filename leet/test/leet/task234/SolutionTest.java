package leet.task234;

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
	void positive_test() {
		// Given
		ListNode listNode4 = new ListNode(1);
		ListNode listNode3 = new ListNode(2, listNode4);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);
		
		// When
		boolean expected = true;
		boolean actual = solution.isPalindrome(listNode1);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void negative_test() {
		// Given
		ListNode listNode2 = new ListNode(2);
		ListNode listNode1 = new ListNode(1, listNode2);
		
		// When
		boolean expected = false;
		boolean actual = solution.isPalindrome(listNode1);
		
		// Then
		assertEquals(expected, actual);
	}
	
}
