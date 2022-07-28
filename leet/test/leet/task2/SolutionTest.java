package leet.task2;

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
		ListNode listNode1_3 = new ListNode(3);
		ListNode listNode1_2 = new ListNode(4, listNode1_3);
		ListNode listNode1_1 = new ListNode(2, listNode1_2);
		
		ListNode listNode2_3 = new ListNode(4);
		ListNode listNode2_2 = new ListNode(6, listNode2_3);
		ListNode listNode2_1 = new ListNode(5, listNode2_2);
		
		// When
		ListNode listNode3 = new ListNode(8);
		ListNode listNode2 = new ListNode(0, listNode3);
		ListNode listNode1 = new ListNode(7, listNode2);
		
		ListNode expected = listNode1;
		ListNode actual = solution.addTwoNumbers(listNode1_1, listNode2_1);
		
		// Then
		assertListsEquals(expected, actual);
	}
	
	@Test
	void ex2_test() {
		// Given
		ListNode listNode1 = new ListNode(0);
		
		ListNode listNode2 = new ListNode(0);
		
		// When
		ListNode listNode = new ListNode(0);
		
		ListNode expected = listNode;
		ListNode actual = solution.addTwoNumbers(listNode1, listNode2);
		
		// Then
		assertListsEquals(expected, actual);
	}
	
	@Test
	void ex3_test() {
		// Given
		ListNode listNode1_7 = new ListNode(9);
		ListNode listNode1_6 = new ListNode(9, listNode1_7);
		ListNode listNode1_5 = new ListNode(9, listNode1_6);
		ListNode listNode1_4 = new ListNode(9, listNode1_5);
		ListNode listNode1_3 = new ListNode(9, listNode1_4);
		ListNode listNode1_2 = new ListNode(9, listNode1_3);
		ListNode listNode1_1 = new ListNode(9, listNode1_2);
		
		ListNode listNode2_4 = new ListNode(9);
		ListNode listNode2_3 = new ListNode(9, listNode2_4);
		ListNode listNode2_2 = new ListNode(9, listNode2_3);
		ListNode listNode2_1 = new ListNode(9, listNode2_2);
		
		// When
		ListNode listNode8 = new ListNode(1);
		ListNode listNode7 = new ListNode(0, listNode8);
		ListNode listNode6 = new ListNode(0, listNode7);
		ListNode listNode5 = new ListNode(0, listNode6);
		ListNode listNode4 = new ListNode(9, listNode5);
		ListNode listNode3 = new ListNode(9, listNode4);
		ListNode listNode2 = new ListNode(9, listNode3);
		ListNode listNode1 = new ListNode(8, listNode2);
		
		ListNode expected = listNode1;
		ListNode actual = solution.addTwoNumbers(listNode1_1, listNode2_1);
		
		// Then
		assertListsEquals(expected, actual);
	}
	
	private void assertListsEquals(ListNode listNode1, ListNode listNode2) {
		while (listNode1 != null) {
			int val1 = listNode1.val;
			int val2 = listNode2.val;
			
			assertEquals(val1, val2);
			
			listNode1 = listNode1.next;
			listNode2 = listNode2.next;
		}
		assertNull(listNode1);
		assertNull(listNode2);
	}

}
