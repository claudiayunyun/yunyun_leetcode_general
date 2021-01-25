package com.leetcode.general;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairsInAnArray {
	public int findPairs(int[] nums, int k) {
		/*
		 * 1 brute force, sorted array, check unique pairs
		 * time O(n2), space O(n)
		 * 2 HashMap time O(n), space O(n)
		 * key: number, value: the times of appearance of the number
		 */
		int result = 0;
		Map<Integer, Integer> pairs = new HashMap<>();
		for(int num : nums) {
			pairs.put(num, pairs.getOrDefault(num, 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
			if(k == 0 && entry.getValue() > 1) result++;
			else if (k > 0 && pairs.containsKey(entry.getKey() + k)) result++;
		}
				
        return result;
    }
}
