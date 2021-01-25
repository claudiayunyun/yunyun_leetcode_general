package com.leetcode.general.medium;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
	public int findKthLargest(int[] nums, int k) {
		/*
		 * use PriorityQueue to implement heap
		 * keep k elements in the queue in increasing order
		 * poll() get and remove the head
		 * peek() just get the head
		 * 
		 * 1 Brute force arrays.sort(), Time: O(NlogN), Space: O(1)
		 * 2 Heap O(NlogK), space: O(k)-> store k elements
		 */
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int num : nums) {
			queue.add(num);
			if(queue.size() > k) {
				queue.poll();
			}
		}
        return queue.peek();
    }
}
