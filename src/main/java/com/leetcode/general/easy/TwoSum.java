package com.leetcode.general.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	/*
	 * Assumptions:
	 * each input would have exactly one solution, 
	 * and you may not use the same element twice.
	 * 1 brute force: no memory needed, time O(n2)
	 * 2 use HashMap: key: number, value: index
	 *   extra memory O(n), time O(n) 
	 *   
	 * return indices  of the two numbers
	 */
	
	public int[] twoSum(int[] nums, int target) {
		// key: number, value: index
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
	
	/*
	 * Two Pointers -- Time O(n), Space O(1)
	 */
	public int[] twoSumInputArrayIsSorted(int[] numbers, int target) {
        //initialize two pointer 
		// left (beginning of the array) 
		// right (end of the array)
		int left = 0, right = numbers.length - 1;
        while(left < right) {
        	// two numbers sum to target, return
        	if(numbers[left] + numbers[right] == target) return new int[] {left, right};
        	// if sum < target, increase left index by 1
        	else if(numbers[left] + numbers[right] < target) left++;
        	// if sum > target, decrease right index by 1
        	else right--;
        }
        
        throw new IllegalArgumentException("No match Two Sum");
    }
	
	/*
	 * Method: first sort the array, then Two Pointers
	 * Time: sort O(NlogN), two pointers O(N)
	 * Space: O(logN) to O(N), depends on sorting algo
	 */
	public int twoSumLessThanKTwoPointers(int[] nums, int k) {
		// step 1: sort the array
		Arrays.sort(nums);
		
		// step 2: two pointers
		// result: record the max sum so far
		int result = -1;
		// left: beginning of the array
		// right: end of the array
		int left = 0, right = nums.length - 1;
		while(left < right) {
			// if the sum of two numbers less than k:
			// update result
			// increase left by 1
			if(nums[left] + nums[right] < k) {
				result = Math.max(result, nums[left] + nums[right]);
				left++;
			} else {
				right--;
			}
		}		
		return result;       
    }
	
	/*
	 * leverage the fact that the input number range is limited to [1..1000]
	 * counting sort + two pointers
	 */
	public int twoSumLessThanKCountingSort(int[] nums, int k) {
		// create a counting array, count[i] = j means value i appears j times
		int[] count = new int[1001];
		for(int num : nums) {
			count[num]++;
		}
		
		// result: record the max sum so far
		int result = -1;
		
		//two pointers
		// left: beginning of the array (also the number 1 value)
		// right: end of the array (also the number 2 value)
		int left = 0, right = 1000;
		while(left <= right) {
			// two numbers sum greater or equals to k
			// there is no number equals right
			if(left + right >= k || count[right] == 0) {
				//decreasing right by 1
				right--;
			} else {
				// first, check whether there is number equals left (count[left] > 0)
				// if left and right is the same value, count[left] > 1
				if(count[left] > (left < right ? 0 : 1)) {
					//update result
					result = Math.max(result, left + right);
				}
				// increasing left by 1
				left++;
			}
		}		
		return result;
    }

}
