package leet.task19;

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
		ListNode listNode5 = new ListNode(5);
		ListNode listNode4 = new ListNode(4, listNode5);
		ListNode listNode3 = new ListNode(3, listNode4);
		ListNode listNode2 = new ListNode(2, listNode3);
		ListNode listNode1 = new ListNode(1, listNode2);

		int n = 2;

		// Then
		List<Integer> expected = List.of(1, 2, 3, 5);
		List<Integer> actual = toList(solution.removeNthFromEnd(listNode1, n));
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		ListNode listNode1 = new ListNode(1);

		int n = 1;

		// Then
		List<Integer> expected = List.of();
		List<Integer> actual = toList(solution.removeNthFromEnd(listNode1, n));
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex3Test() {
		// Given
		ListNode listNode2 = new ListNode(2);
		ListNode listNode1 = new ListNode(1, listNode2);

		int n = 1;

		// Then
		List<Integer> expected = List.of(1);
		List<Integer> actual = toList(solution.removeNthFromEnd(listNode1, n));
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
