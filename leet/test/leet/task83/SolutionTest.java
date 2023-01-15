package leet.task83;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
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
		List<Integer> values = List.of(1, 1, 2);
		ListNode listNode = toListNode(values);
		
		// When
		listNode = solution.deleteDuplicates(listNode);
		
		// Then
		List<Integer> expected = List.of(1, 2);
		List<Integer> actual = toList(listNode);
		assertIterableEquals(expected, actual);
	}
	
	@Test
	void ex2Test() {
		// Given
		List<Integer> values = List.of(1, 1, 2, 3, 3);
		ListNode listNode = toListNode(values);
		
		// When
		listNode = solution.deleteDuplicates(listNode);
		
		// Then
		List<Integer> expected = List.of(1, 2, 3);
		List<Integer> actual = toList(listNode);
		assertIterableEquals(expected, actual);
	}
	
	private ListNode toListNode(List<Integer> values) {
		values = new LinkedList<>(values);
		Collections.reverse(values);
		ListNode listNode = null;
		for (int value : values) {
			listNode = new ListNode(value, listNode);
		}
		return listNode;
	}
	
	private List<Integer> toList(ListNode listNode) {
		List<Integer> list = new LinkedList<>();
		while (listNode != null) {
			int value = listNode.val;
			list.add(value);
			listNode = listNode.next;
		}
		return list;
	}

}
