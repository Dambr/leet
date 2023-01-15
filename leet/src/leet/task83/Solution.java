package leet.task83;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {

	public ListNode deleteDuplicates(ListNode head) {
		List<Integer> list = toList(head);
		Set<Integer> set = new LinkedHashSet<>(list);
		list = new LinkedList<>(set);
		ListNode listNode = toListNode(list);
		return listNode;
	}
	
	private ListNode toListNode(List<Integer> list) {
		list = new LinkedList<>(list);
		Collections.reverse(list);
		ListNode listNode = null;
		for (int val : list) {
			listNode = new ListNode(val, listNode);
		}
		return listNode;
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
