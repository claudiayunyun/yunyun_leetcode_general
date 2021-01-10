package LeetCode.General;

public class TrappingRainWater {
	public int trap(int[] height) {
		/*
		 * DP left_max, right_max
		 * Time: O(n), Space: O(n)-> store left_max and right_max
		 * min(left_max, right_max) - height for each position i 
		 */
		if(height.length == 0) return 0;
		
		int[] leftMax = new int[height.length];
		leftMax[0] = height[0];
		for(int i = 1; i < height.length; i++) {
			if(height[i] > leftMax[i - 1]) leftMax[i] = height[i];
			else leftMax[i] = leftMax[i - 1];
		}
		
		int[] rightMax = new int[height.length];
		rightMax[height.length - 1] = height[height.length - 1];
		for(int j = height.length - 2; j >= 0; j--) {
			if(height[j] > rightMax[j + 1]) rightMax[j] = height[j];
			else rightMax[j] = rightMax[ j + 1];
		}
		
		int unit = 0;
		for(int i = 0; i < height.length; i++) {
			unit += Math.min(leftMax[i], rightMax[i]) - height[i];
		}
        return unit;
    }
	
}
