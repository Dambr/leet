package leet.task19;

public class Solution {

	public ListNode removeNthFromEnd(ListNode head, int n) {

		int length = getLength(head);

		if (n == length) {
			head = head.next;
		} else {
			int index = length - n;

			ListNode prev = getListNodeByIndex(head, index - 1);
			ListNode next = getListNodeByIndex(head, index + 1);

			prev.next = next;
		}

		return head;
	}

	private int getLength(ListNode head) {
		int length = 0;

		while (head != null) {
			length++;
			head = head.next;
		}

		return length;
	}

	private ListNode getListNodeByIndex(ListNode head, int index) {
		ListNode listNode = head;
		for (int i = 1; i <= index; i++) {
			listNode = listNode.next;
		}
		return listNode;
	}

}
