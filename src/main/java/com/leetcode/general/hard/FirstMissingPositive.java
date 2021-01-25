package com.leetcode.general.hard;

import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		/*
		 * 1 remove zeros
		 * 2 remove numbers > nums.length
		 * 3 use HashMap to store key: num, value: the times of presence
		 */
		Map<Integer, Integer> counter = new HashMap<>();
		for(int num: nums) {
			if(num <= 0) continue;
			if(num > nums.length) continue;
			counter.put(num, counter.getOrDefault(num, 0) + 1);
		}
		
		for(int i = 1; i <= nums.length; i++) {
			if(counter.get(i) == null) return i;
		}
		
        return nums.length + 1;
    }
}
