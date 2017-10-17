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
        for (int i = 0; i < N; i++) {
        	for(int j = i+1; j < N; j++) {
        		int k = binarySearch(nums, -(nums[i]+nums[j]));
        		if (k > j) {
        			listInt.add(nums[i]);
        			listInt.add(nums[j]);
        			listInt.add(nums[k]);
        			listSet.add(listInt);
        			listInt = new ArrayList<Integer>();
        		}
        	}
        }
        return listSet;
    }
    
    private int binarySearch(int[] a, double val) {
    	int hi = a.length - 1;
    	int lo = 0;
    	int mid;
    	while(lo < hi) {
    		mid = lo + (hi - lo)/2;
    		if(a[mid] < val) lo = mid;
    		else if(a[mid] > val) hi = mid;
    		else return mid;
    	}
    	return 0;
    }
}
