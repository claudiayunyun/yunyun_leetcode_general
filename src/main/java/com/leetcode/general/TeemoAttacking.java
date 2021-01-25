package com.leetcode.general;

public class TeemoAttacking {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
        
		/*
		 * check the interval vs duration
		 * !!! empty timeseries check
		 */
		int total = 0;
        
        if(timeSeries.length == 0) return total;
        
		for(int i = 0; i < timeSeries.length - 1; i++) {
			if(timeSeries[i + 1] - timeSeries[i] < duration) {
				total += timeSeries[i + 1] - timeSeries[i];
			} else {
				total += duration;
			}
        }
		
		return total + duration;
    }

}
