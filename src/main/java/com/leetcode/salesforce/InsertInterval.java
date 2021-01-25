package com.leetcode.salesforce;

import java.util.LinkedList;

public class InsertInterval {
	/*
	 * Insert positions: start, end, in between
	 * 
	 */
	public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0) return new int[][] {newInterval};
        
        LinkedList<int[]> newIntervals = new LinkedList<>();
        for(int i = 0; i < intervals.length; i++) {
        	if(newInterval[0] < intervals[i][0]) {
        		mergeIntervals(newIntervals, newInterval);
        		for(int j = i; j < intervals.length; j++) {
        			mergeIntervals(newIntervals, intervals[j]);
        		}       		
        		return newIntervals.toArray(new int[newIntervals.size()][2]);
        	} else {
        		newIntervals.add(intervals[i]);
        	}
        }
        mergeIntervals(newIntervals, newInterval);
        return newIntervals.toArray(new int[newIntervals.size()][2]);
    }
	
	private void mergeIntervals(LinkedList<int[]> newIntervals, int[] newInterval) {
		if(newIntervals.isEmpty()) newIntervals.add(newInterval);
		if(newIntervals.getLast()[1] < newInterval[0]) newIntervals.add(newInterval);
		else {
			newIntervals.getLast()[1] = Math.max(newIntervals.getLast()[1], newInterval[1]);
		}
	}
}
