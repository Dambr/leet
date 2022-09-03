package leet.task21;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		List<Integer> vals1 = toList(list1);
		List<Integer> vals2 = toList(list2);
		
		List<Integer> merge = new LinkedList<>();
		merge.addAll(vals1);
		merge.addAll(vals2);
		
		Comparator<Integer> comparator = (val1, val2) -> {
			return Integer.compare(val2, val1);
		};
		merge.sort(comparator);
		
		ListNode result = toListNode(merge);
		
		return result;
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
	
	private ListNode toListNode(List<Integer> vals) {
		ListNode listNode = null;
		for (int val : vals) {
			listNode = new ListNode(val, listNode);
		}
		return listNode;
	}

}
