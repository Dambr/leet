package leet.task23;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public ListNode mergeKLists(ListNode[] lists) {
		List<Integer> vals = new LinkedList<>();
		for (ListNode listNode : lists) {
			List<Integer> curVals = toValsList(listNode);
			vals.addAll(curVals);
		}

		Comparator<Integer> comparator = (val1, val2) -> Integer.compare(val2, val1);

		vals.sort(comparator);

		ListNode result = toListNode(vals);

		return result;
	}

	private ListNode toListNode(List<Integer> vals) {
		ListNode listNode = null;

		for (int val : vals) {
			listNode = new ListNode(val, listNode);
		}

		return listNode;
	}

	private List<Integer> toValsList(ListNode listNode) {
		List<Integer> list = new LinkedList<>();

		while (listNode != null) {
			int val = listNode.val;
			list.add(val);
			listNode = listNode.next;
		}

		return list;
	}

}
