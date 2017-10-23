package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<Integer> listInt = new ArrayList<Integer>();
    	List<List<Integer>> listSet = new ArrayList<List<Integer>>();
    	int N = nums.length;
    	Arrays.sort(nums);
    	int lasti = Integer.MIN_VALUE;
    	int lastj = Integer.MIN_VALUE;
        for (int i = 0; i < N - 2; i++) {
        	if (nums[i] != lasti) {
	        	for(int j = i+1; j < N - 1; j++) {
	        		if(lastj != nums[j]) {
		        		int val = -(nums[i] + nums[j]);	
		        		int k = binarySearch(nums, val, j+1);	
		        		if (k > j) {
	        				listInt.add(nums[i]);
	        				listInt.add(nums[j]);
	        				listInt.add(nums[k]);
	        				listSet.add(listInt);
	        				lasti = nums[i];
	        				listInt = new ArrayList<Integer>();
		        		}
		        		lastj = nums[j];
	        		}
	        	}
	        	lasti = nums[i];
        	}
        }
        return listSet;
    }
    
    public int binarySearch(int[] a, int val, int lo) {
    	int hi = a.length - 1;
    	if(val > a[hi] || val < a[lo]) return -1;
    	if(val == a[hi]) return hi;
    	if(val == a[lo]) return lo;
    	int mid = -1;
    	while(hi - lo > 1) {
//    		System.out.println("lo:" + lo + ",hi:" + hi);
    		mid = lo + (hi - lo)/2;
//    		System.out.println("mid:" + mid);
    		if(a[mid] < val) lo = mid;
    		else if(a[mid] > val) hi = mid;
    		else return mid;
    	}
    	return -1;
    }
}
