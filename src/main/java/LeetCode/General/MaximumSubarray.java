package LeetCode.General;

public class MaximumSubarray {
	
	public int maxSubArray(int[] nums) {
		int maxSum = nums[0], currentSum = nums[0];
		for(int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
        return maxSum;
    }

}
