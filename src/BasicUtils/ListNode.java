package BasicUtils;

public class ListNode {
	public int val;
	public ListNode next;
	
	public ListNode(int v) {
		this.val = v;
		this.next = null;
	}
	
	public ListNode(int v, ListNode ln) {
		this.val = v;
		this.next = ln;
	}

}
