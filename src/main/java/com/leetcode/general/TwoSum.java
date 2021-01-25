package com.leetcode.general;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	/*
	 * 1 brute force: no memory needed, time O(n2)
	 * 2 use HashMap: key: number, value: index
	 *   extra memory O(n), time O(n) 
	 */
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
        for(int i = 0; i < nums.length; i++) {
        	if(map.containsKey(target - nums[i])) {
        		return new int[] {map.get(target - nums[i]), i};
        	} else {
        		map.put(nums[i], i);
        	}
        }
        
        throw new IllegalArgumentException("No match Two Sum");
    }

}
