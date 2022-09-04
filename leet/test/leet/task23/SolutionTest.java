package leet.task23;

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
		ListNode listNode1_3 = new ListNode(5);
		ListNode listNode1_2 = new ListNode(4, listNode1_3);
		ListNode listNode1_1 = new ListNode(1, listNode1_2);

		ListNode listNode2_3 = new ListNode(4);
		ListNode listNode2_2 = new ListNode(3, listNode2_3);
		ListNode listNode2_1 = new ListNode(1, listNode2_2);

		ListNode listNode3_2 = new ListNode(6);
		ListNode listNode3_1 = new ListNode(2, listNode3_2);

		ListNode[] listNodes = { listNode1_1, listNode2_1, listNode3_1 };

		// Then
		List<Integer> expected = List.of(1, 1, 2, 3, 4, 4, 5, 6);
		List<Integer> actual = toList(solution.mergeKLists(listNodes));
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex2Test() {
		// Given
		ListNode[] listNodes = {};

		// Then
		List<Integer> expected = List.of();
		List<Integer> actual = toList(solution.mergeKLists(listNodes));
		assertIterableEquals(expected, actual);
	}

	@Test
	void ex3Test() {
		// Given
		ListNode listNode = null;
		ListNode[] listNodes = { listNode };

		// Then
		List<Integer> expected = List.of();
		List<Integer> actual = toList(solution.mergeKLists(listNodes));
		assertIterableEquals(expected, actual);
	}

	private List<Integer> toList(ListNode listNode) {
		List<Integer> list = new LinkedList<>();
		while (listNode != null) {
			int val = listNode.val;
			list.add(val);
			listNode = listNode.next;
		}
		return list;
	}

}
