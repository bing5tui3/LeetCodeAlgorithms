package Main;
import Solutions.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import BasicUtils.*;

public class Test {

	public static void main(String[] args) {
		
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(4);
		ListNode l13 = new ListNode(5);
		l11.next = l12;
		l12.next = l13;
		
		ListNode l21 = new ListNode(4);
		ListNode l22 = new ListNode(5);
		ListNode l23 = new ListNode(6);
		l21.next = l22;
		l22.next = l23;
		
		ListNode[] lists = {l11, l21};
		
		MakeKSortedList mSL = new MakeKSortedList();
		ListNode listHead = mSL.mergeKLists(lists);
		
		while (listHead != null) {
			System.out.println(listHead.val);
			listHead = listHead.next;
		}
		
		
//		int[] nums = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
//		ThreeSum ts = new ThreeSum();
//		Arrays.sort(nums);
//		for(int i: nums) {
//			System.out.println(i);
//		}
//		
//		System.out.println("result:" + ts.binarySearch(nums, 4, 3));
//		List<List<Integer>> listSet = ts.threeSum(nums);
//		for(List<Integer> li: listSet) {
//			for(Integer i: li) {
//				System.out.println(i);
//			}
//		}
		
//		ResizingArrayQueueOfStrings raqs = new ResizingArrayQueueOfStrings();
//		raqs.push("11111");
//		raqs.push("22222");
//		raqs.push("22222");
//		raqs.push("22222");
//		raqs.push("22222");
//		raqs.push("22222");
//		raqs.push("22222");
//		raqs.push("22222");
//		raqs.push("22222");
//		raqs.push("22222");
//		raqs.push("22222");
//		raqs.pop();
//		raqs.pop();
//		raqs.pop();
//		raqs.pop();
//		raqs.pop();
//		raqs.pop();
//		raqs.pop();
//		raqs.pop();
//		raqs.pop();
//		raqs.pop();
//		raqs.pop();
//		System.out.println(raqs.size());
//		System.out.println(raqs.arraySize());
//		for (String s: raqs) {
//			System.out.println(s);
//		}
		
//		int height[] = {1,2,3,4};
//		ContainerWithMostWater cwmw = new ContainerWithMostWater();
//		System.out.println(cwmw.maxArea(height));
//		String ss = "2147483648";
//		int in = -2147483648;
//		System.out.println(in);
//		Ascii2Integer atoi = new Ascii2Integer();
//		System.out.println(atoi.myAtoi(ss));
//		ReverseInteger ri = new ReverseInteger();
//		System.out.println(ri.reverse(-123456));
//		LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
//		String s1 = "abcbaabcba";
//		
//		String s3 = lps.longestPalindrome(s1);
//		System.out.println(s3);
//		int nums1[] = {1,2};
//		int nums2[] = {1,2,3,4};
//		MedianOfTwoSortedArrays mtsa = new MedianOfTwoSortedArrays();
//		System.out.println(mtsa.findMedianSortedArrays(nums1, nums2));
//		
//		int a1[] = {1};
//		System.out.println(a1.length);
//		int a2[] = Arrays.copyOfRange(a1, 1, 1);
//		System.out.println(a2.length);
//		for(int i = 0; i < a2.length; i++) {
//			System.out.print(a2[i]);
//			System.out.print(",");
//		}
//		System.out.println();
//		LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
//		int maxLen = lswrc.lengthOfLongestSubstring("aaaaaa");
//		System.out.println(maxLen);
//		int s[] = new int[1000];
//		System.out.println(s[8]);
//		AddTwoNumbers a = new AddTwoNumbers();
//		ListNode l11 = new ListNode(2);
//		ListNode l21 = new ListNode(4);
//		ListNode l31 = new ListNode(3);
//		ListNode l12 = new ListNode(5);
//		ListNode l22 = new ListNode(6);
//		ListNode l32 = new ListNode(4);
//		l11.next = l21;
//		l21.next = l31;
//		l12.next = l22;
//		l22.next = l32;
//		ListNode l1b = l11;
//		ListNode l2b = l12;
//		ListNode l1 = l11;
//		ListNode l2 = l12;
//		while(l1b != null) {
//			System.out.print(l1b.val);
//			l1b = l1b.next;
//		}
//		System.out.println();
//		while(l2b != null) {
//			System.out.print(l2b.val);
//			l2b = l2b.next;
//		}
//		
//		ListNode lt = a.addTwoNumbers(l1, l2);
//		System.out.println();
//		while(lt != null) {
//			System.out.print(lt.val);
//			lt = lt.next;
//		}
	}

}
