package leet.task876;

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
	void evenCount_test() {
		// Given
		ListNode listNode5 = new ListNode(5);
		ListNode listNode4 = new ListNode(4, listNode5);
		ListNode listNode3 = new ListNode(3, listNode4);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);
	
		// When
		ListNode expected = listNode3;
		ListNode actual = solution.middleNode(listNode1);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	void oddCount_test() {
		// Given
		ListNode listNode6 = new ListNode(6);
		ListNode listNode5 = new ListNode(5, listNode6);
		ListNode listNode4 = new ListNode(4, listNode5);
		ListNode listNode3 = new ListNode(3, listNode4);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);
		
		// When
		ListNode expected = listNode4;
		ListNode actual = solution.middleNode(listNode1);
		
		// Then
		assertEquals(expected, actual);
	}
	
}
