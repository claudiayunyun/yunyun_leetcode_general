package com.leetcode.general;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
		/*
		 * Arrays.sort with customized comparator
		 * Similar to meeting room problem
		 * 
		 * !!New: List of array (use LinkedList for easy access of last element)
		 * List.toArray
		 * initialize 2D array: new int[2][6]
		 * at least specify the 1st dimension  
		 */
		
		LinkedList<int[]> merged = new LinkedList<>();
        
        Arrays.sort(intervals, (intervalA, intervalB) -> Integer.compare(intervalA[0], intervalB[0]));
        
        for(int[] interval : intervals) {
        	if(merged.isEmpty()) merged.add(interval);
        	
        	if(merged.getLast()[1] < interval[0]) merged.add(interval);
        	else {
        		merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
        	}
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
