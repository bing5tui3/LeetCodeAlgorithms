package Solutions;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
    	int l = 0;
    	int r = height.length - 1;
    	if(r == 0) return 0;
    	int maxArea = 0;
    	int area = 0;
    	while(l < r) {
    		if(height[l] <= height[r]) {
    			area = (r - l) * height[l++];    			
    		} else {
    			area = (r - l) * height[r--];
    		}
    		maxArea = (area > maxArea)? area: maxArea;
    	}
        return maxArea;
    }
}
