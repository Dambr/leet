package leet.task21;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
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
		ListNode listNode1_4 = new ListNode(4);
		ListNode listNode1_2 = new ListNode(2, listNode1_4);
		ListNode listNode1_1 = new ListNode(1, listNode1_2);
		
		ListNode listNode2_4 = new ListNode(4);
		ListNode listNode2_3 = new ListNode(3, listNode2_4);
		ListNode listNode2_1 = new ListNode(1, listNode2_3);
		
		// Then
		List<Integer> expected = List.of(1,1,2,3,4,4);
		List<Integer> actual = toList(solution.mergeTwoLists(listNode1_1, listNode2_1));
		assertIterableEquals(expected, actual);
	}
	
	@Test
	void ex2Test() {
		// Then
		List<Integer> expected = List.of();
		List<Integer> actual = toList(solution.mergeTwoLists(null, null));
		assertIterableEquals(expected, actual);
	}
	
	@Test
	void ex3Test() {
		// Given
		ListNode listNode2_1 = new ListNode(0);
		
		// Then
		List<Integer> expected = List.of(0);
		List<Integer> actual = toList(solution.mergeTwoLists(null, listNode2_1));
		assertIterableEquals(expected, actual);
	}
	
	private List<Integer> toList(ListNode listNode) {
		List<Integer> result = new LinkedList<>();

		while (listNode != null) {
			result.add(listNode.val);
			listNode = listNode.next;
		}

		return result;
	}

}
