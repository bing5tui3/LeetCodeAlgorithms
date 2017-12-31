package Solutions;
import BasicUtils.ListNode;


public class MakeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        return partList(lists, 0, lists.length - 1);
    }
    
    public static ListNode partList(ListNode[] lists, int start, int end) {
    	if (start == end) return lists[start];
    	
    	if (start < end) {
    		int partPoint = (start + end) / 2;
    		ListNode listNodeUpperBracket = partList(lists, partPoint+1, end);
    		ListNode listNodeDownBracket = partList(lists, start, partPoint);
    		return merge(listNodeUpperBracket, listNodeDownBracket);
    	} else {
    		return null;
    	}
    }
    
    public static ListNode merge(ListNode l1, ListNode l2) {
    	if (l1 == null) return l2;
    	if (l2 == null) return l1;
    	if (l1.val <= l2.val) {
    		l1.next = merge(l1.next, l2);
    		return l1;
    	} else {
    		l2.next = merge(l1, l2.next);
    		return l2;
    	}
    }
}
