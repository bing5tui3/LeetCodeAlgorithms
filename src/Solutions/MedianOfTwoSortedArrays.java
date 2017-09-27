package Solutions;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	double median = 0.0;
    	int max = Integer.MAX_VALUE;
    	int nums1Len = nums1.length;
    	int nums2Len = nums2.length;
    	int totalLen = nums1Len + nums2Len;
    	int remainder = totalLen % 2;
    	int target = totalLen / 2;
    	int lastCast = Integer.MIN_VALUE;
        int target1 = 0, target2 = 0;
        int offset1 = -1, offset2 = -1;
        int remain1Len = nums1Len - offset1 - 1;
        int remain2Len = nums2Len - offset2 - 1;
        int tarDistance = target - offset1 - offset2 - 2;
        while(remain1Len != 0 && remain2Len != 0 && tarDistance != 0) {
        	target1 = target / 2 - 1 + offset1 + 1;
        	target1 = (target1 < offset1 + 1)? offset1 + 1: target1;
            target1 = (target1 > nums1Len - 1)? nums1Len - 1: target1;
            target2 = target - target1 - 1;
            target2 = (target2 < offset2 + 1)? offset2 + 1: target2;
            target2 = (target2 > nums2Len-1)? nums2Len-1: target2;
            target1 = target - target2 - 1;
            
        	if (nums1[target1] <= nums2[target2]) {
        		lastCast = (nums1[target1] > lastCast)? nums1[target1]: lastCast;
        		offset1 = target1;
        		remain1Len = nums1Len - offset1 - 1;
            } else {
            	lastCast = (nums2[target2] > lastCast)? nums2[target2]: lastCast;
            	offset2 = target2;
            	remain2Len = nums2Len - offset2 - 1;
            }
        	tarDistance = target - offset1 - offset2 - 2;
        }
        
        if(tarDistance == 0) {
        	int nums1First = (remain1Len > 0)? nums1[offset1 + 1]: max;
        	int nums2First = (remain2Len > 0)? nums2[offset2 + 1]: max;
        	median = (nums1First > nums2First)? nums2First: nums1First;
        	
        } else {
        	if(remain1Len != 0) {
        		median = nums1[target - offset2 - 1];
        		lastCast = (target - offset2 - 1 >= 1 && lastCast < nums1[target - offset2 - 2])? nums1[target - offset2 - 2]: lastCast;
        	} else {
        		median = nums2[target - offset1 - 1];
        		lastCast = (target - offset1 - 1 >= 1 && lastCast < nums2[target - offset1 - 2])? nums2[target - offset1 - 2]: lastCast;
        	}
        }
        if(remainder == 0) { 
            median = (median + lastCast) / 2;
        }
        return median;

    }
}
