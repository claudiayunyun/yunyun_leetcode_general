package com.leetcode.general.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();
		for(int i = 0; i < nums.length && nums[i] <= 0; i++) {
			if(i == 0 || nums[i] != nums[i - 1]) {
				twoSum(i, nums, result);
			}
			
		}
        return result;
    }
	
	private void twoSum(int index, int[] nums, List<List<Integer>> result) {
		Set<Integer> visited = new HashSet<>(); 
		for(int i = index + 1; i < nums.length; i++) {
			int target = - nums[index] - nums[i];
			if(visited.contains(target)) {
				result.add(Arrays.asList(target,nums[i], nums[index]));
				while(i < nums.length - 1 && nums[i] == nums[i + 1]) {
					i++;
				}
			}
			visited.add(nums[i]);
		}
	}
}
