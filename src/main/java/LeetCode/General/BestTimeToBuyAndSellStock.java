package LeetCode.General;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		/*
		 * 1 brute force: time O(n2), space: O(1)
		 * 2 one pass: find the minPrice, also find the maxProfit
		 *   time O(n), space O(1)
		 */
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++) {
        	if(minPrice >= prices[i]) {
        		minPrice = prices[i];
        	} else if(maxProfit < prices[i] - minPrice) {
        		maxProfit = prices[i] - minPrice;
        	}
        }
        return maxProfit;
    }

}
