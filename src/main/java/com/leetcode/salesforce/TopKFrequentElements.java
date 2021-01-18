package com.leetcode.salesforce;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int num : nums) {
        	numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }
        
        Queue<Integer> topKNums = new PriorityQueue<Integer>((a, b) -> numMap.get(b) - numMap.get(a));
        for(int num : numMap.keySet()) {
        	topKNums.add(num);
        }
        
        for(int i = 0; i < k; i++) {
        	result[i] = topKNums.poll();
        }
        
        return result;
    }
}
