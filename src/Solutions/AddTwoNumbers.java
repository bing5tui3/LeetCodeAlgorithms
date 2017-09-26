package Solutions;

import BasicUtils.ListNode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode next = new ListNode(0);
        ListNode head = next;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
        	int sum = ((l1 == null)? 0: l1.val) + ((l2 == null)? 0: l2.val) + carry;
        	next.val = sum % 10;
        	carry = sum / 10;
        	l1 = (l1 != null)? l1.next: l1;
        	l2 = (l2 != null)? l2.next: l2;
        	if (l1 != null || l2 != null || carry != 0) {
        		next.next = new ListNode(0);
            	next = next.next;
        	}
        }
        return head;
    }
}
