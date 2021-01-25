package com.leetcode.salesforce;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingRoomsII {
	/*
	 * Sort intervals by start time
	 * use Min Heap to store end time
	 */
	public int minMeetingRooms(int[][] intervals) {
        int rooms = 1;
        
        Arrays.sort(intervals, (intervalA, intervalB) -> intervalA[0] - intervalB[0]);
        
        Queue<Integer> endingTime = new PriorityQueue<Integer>((a, b) -> a - b);
        endingTime.add(intervals[0][1]);
        
        for(int i = 1; i < intervals.length; i++) {
        	if(endingTime.peek() > intervals[i][0]) rooms++;
        	else endingTime.poll();
        	endingTime.add(intervals[i][1]);
        }
        
        return rooms;
    }
}
 