package leet.task876;

import java.util.LinkedList;
import java.util.List;

public class Solution {

	public ListNode middleNode(ListNode head) {
		
		List<ListNode> list = toList(head);
		
		int size = list.size();
		int index = size / 2;
		
		ListNode result = list.get(index);
		
		return result;
	}
	
	private List<ListNode> toList(ListNode listNode) {
		List<ListNode> result = new LinkedList<>();
		while (listNode != null) {
			result.add(listNode);
			listNode = listNode.next;
		}
		return result;
	}
	
}
