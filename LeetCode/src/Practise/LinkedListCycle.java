package Practise;

public class LinkedListCycle {
	/*
	 * This is similar with CC150 question. You may try
	 * "fast runner and slow runner" solution. Fast pointer runs 2 steps at a
	 * time and slow runner runs 1 step at a time. They both start from
	 * beginning. If faster runner catches slow runner some time, it means
	 * linked list has a circle.
	 */
	public boolean hasCycle(ListNode head) {
		ListNode first = head;
		ListNode second = head;

		while (first != null && first.next != null) {
			second = second.next;
			first = first.next.next;
			if (first == second) {
				return true;
			}

		}
		return false;

	}

	/*
	 * Given a linked list, return the node where the cycle begins. If there is
	 * no cycle, return null.
	 * 
	 * Follow up: Can you solve it without using extra space? Input: {1,2}, tail
	 * connects to node index 0 Output: tail connects to node index 1 Expected:
	 * tail connects to node index 0
	 */

	public ListNode detectCycle(ListNode head) {
		ListNode first = head;
		ListNode second = head;

		while (first != null && first.next != null) {
			second = second.next;
			first = first.next.next;
			if (first == second) {
				return head;
			}

		}
		return null;

	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}

/*
 * Given a linked list, determine if it has a cycle in it. Follow up: Can you
 * solve it without using extra space?
 */

