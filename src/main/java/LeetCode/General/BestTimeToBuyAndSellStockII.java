package LeetCode.General;

public class BestTimeToBuyAndSellStockII {
	public int maxProfit(int[] prices) {
		int maxProfit = 0;

		int minPrice = Integer.MAX_VALUE;
		for(int i = 0; i < prices.length; i++) {
			if(prices[i] < minPrice) {
				minPrice = prices[i];
			}
			int nextPrice = i < prices.length - 1 ? prices[i+1] : 0;
			if(prices[i] > nextPrice) {
				
			}
		}
		
		return maxProfit;
    }

}
