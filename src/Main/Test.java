package Main;
import Solutions.*;

import java.lang.reflect.Array;

import BasicUtils.*;

public class Test {

	public static void main(String[] args) {
		
		LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
		int maxLen = lswrc.lengthOfLongestSubstring("aaaaaa");
		System.out.println(maxLen);
		int s[] = new int[1000];
		System.out.println(s[8]);
		AddTwoNumbers a = new AddTwoNumbers();
		ListNode l11 = new ListNode(2);
		ListNode l21 = new ListNode(4);
		ListNode l31 = new ListNode(3);
		ListNode l12 = new ListNode(5);
		ListNode l22 = new ListNode(6);
		ListNode l32 = new ListNode(4);
		l11.next = l21;
		l21.next = l31;
		l12.next = l22;
		l22.next = l32;
		ListNode l1b = l11;
		ListNode l2b = l12;
		ListNode l1 = l11;
		ListNode l2 = l12;
		while(l1b != null) {
			System.out.print(l1b.val);
			l1b = l1b.next;
		}
		System.out.println();
		while(l2b != null) {
			System.out.print(l2b.val);
			l2b = l2b.next;
		}
		
		ListNode lt = a.addTwoNumbers(l1, l2);
		System.out.println();
		while(lt != null) {
			System.out.print(lt.val);
			lt = lt.next;
		}
	}

}
