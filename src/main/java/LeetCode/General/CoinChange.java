package LeetCode.General;

import java.util.Arrays;

public class CoinChange {
	
	public int coinChangeNaiveDynamicProgramming(int[] coins, int amount) {
		
		int[][] dpMetric = new int[coins.length + 1][amount + 1];
		Arrays.fill(dpMetric[coins.length], Integer.MAX_VALUE);
		dpMetric[coins.length][0] = 0;
		
		for(int i = coins.length - 1; i >= 0;  i--) {
			for(int j = 0; j < amount + 1; j++) {
				dpMetric[i][j] = dpMetric[i+1][j];
				for(int k = 1; k <= j/coins[i]; k++ ) {
					int prev = dpMetric[i+1][j - coins[i] * k];
					if(prev < Integer.MAX_VALUE) {
						dpMetric[i][j] = Math.min(prev + k, dpMetric[i][j]);
					}
				}
			}
		}
		
        return dpMetric[0][amount] == Integer.MAX_VALUE ? -1 : dpMetric[0][amount];
    }

}
