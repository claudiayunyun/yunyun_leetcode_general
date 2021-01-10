package LeetCode.General.Hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrogJump {
	
	public boolean canCross(int[] stones) {
		/*
		 * Use Map to store the steps get to current position
		 * update the steps set in each iteration
		 */
		
		if(stones.length < 2) return false;
		if(stones[0] != 0 || stones[1] != 1) return false;
		
		Map<Integer, Set<Integer>> counter = new HashMap<>();
		counter.put(0, new HashSet<>(Arrays.asList(0)));
		counter.put(1, new HashSet<>(Arrays.asList(1)));
		
		for(int i = 2; i < stones.length; i++) {
			counter.put(stones[i], new HashSet<Integer>());
		}
		
		for(int i = 1; i < stones.length; i++) {
			for(int lastJump : counter.get(stones[i])) {
				for(int potentialjump = lastJump - 1; potentialjump <= lastJump + 1; potentialjump++) {
					if(potentialjump> 0 && counter.containsKey(stones[i] + potentialjump)) {
						counter.get(stones[i] + potentialjump).add(
	potentialjump);
				}				
				}
			}
		}
		
		return counter.get(stones[stones.length - 1]).size() > 0;
    }

}
