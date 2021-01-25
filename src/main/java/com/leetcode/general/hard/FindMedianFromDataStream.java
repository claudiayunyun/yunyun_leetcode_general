package com.leetcode.general.hard;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {
	/*
	 * Use 2 heaps: MAX HEAP for smaller half numbers
	 * MIN HEAP for larger half numbers
	 * 
	 */
	PriorityQueue<Integer> smaller;
	PriorityQueue<Integer> larger;
	
	/** initialize your data structure here. */
    public FindMedianFromDataStream() {
        smaller = new PriorityQueue<Integer>(Collections.reverseOrder());
        larger = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        smaller.add(num);
        larger.add(smaller.poll());
        if(smaller.size() < larger.size()) {
        	smaller.add(larger.poll());
        }
    }
    
    public double findMedian() {
    	if(smaller.size() > larger.size()) return Double.valueOf(smaller.peek());
    	else {
    		return Double.valueOf((smaller.peek() + larger.peek()) / 2.0);
    	}
    }
}
