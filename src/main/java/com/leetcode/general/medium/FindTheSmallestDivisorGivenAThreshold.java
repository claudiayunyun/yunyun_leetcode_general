package com.leetcode.general.medium;

public class FindTheSmallestDivisorGivenAThreshold {
	public int smallestDivisor(int[] nums, int threshold) {
		/*
		 * Define the search range is [1, max(nums)]
		 * use binary search to find the divisor
		 */
		
		if(nums.length == 1) return (int)Math.ceil((double)nums[0]/threshold);
		
		int max = 1;
		int min = 1;
		
		for(int num : nums) {
			if(num > max) max = num;
		}
		
		while (min < max) {
			int middle = min + (max - min) / 2;
			int sum = 0;
			for(int num : nums) {
				sum += (int)Math.ceil((double)num/middle);
			}
			if(sum > threshold) min = middle + 1;
			else max = middle;
		}
		
        return min;
    }
}
