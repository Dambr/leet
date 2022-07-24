package leet.task234;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public boolean isPalindrome(ListNode head) {
		Deque<Integer> deque = toDeque(head);
		boolean isPalindrom = isPalindrom(deque);
		return isPalindrom;
    }
    
    private boolean isPalindrom(Deque<Integer> deque) {
    	boolean result = true;
    	while (deque.size() > 1) {
    		int first = deque.pollFirst();
    		int last = deque.pollLast();
    		if (first != last) {
    			result = false;
    			break;
    		}
    	}
    	return result;
    }
    
    private Deque<Integer> toDeque(ListNode listNode) {
    	Deque<Integer> deque = new LinkedList<>();
    	while (listNode != null) {
    		int val = listNode.val;
    		deque.addFirst(val);
    		listNode = listNode.next;
    	}
    	return deque;
    }
    
}
