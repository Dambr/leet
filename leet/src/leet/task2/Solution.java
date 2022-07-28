package leet.task2;

import java.math.BigInteger;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		String string1 = toReverceString(l1);
		String string2 = toReverceString(l2);
		
		BigInteger bigInteger1 = new BigInteger(string1);
		BigInteger bigInteger2 = new BigInteger(string2);
		
		BigInteger bigInteger = bigInteger1.add(bigInteger2);
		String string = bigInteger.toString();
		
		ListNode listNode = toListNode(string);
		
		return listNode;
	}
	
	private String toReverceString(ListNode listNode) {
		List<String> list = new LinkedList<>();
		
		while (listNode != null) {
			int val = listNode.val;
			list.add(String.valueOf(val));
			listNode = listNode.next;
		}
		
		Collections.reverse(list);
		
		return String.join("", list);
	}
	
	private ListNode toListNode(String string) {
		ListNode listNode = null;
		for (int i = 0; i < string.length(); i++) {
			String strAt = String.valueOf(string.charAt(i));
			Integer integer = Integer.parseInt(strAt);
			listNode = (listNode == null) ? new ListNode(integer) : new ListNode(integer, listNode);
		}
		return listNode;
	}

}
