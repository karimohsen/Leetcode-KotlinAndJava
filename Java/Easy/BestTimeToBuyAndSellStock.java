//Problem link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
/*
* You cannot just search for the min and use it cause you can have such a case [2,4,1], in this
* case using the minimum won't give the best result.
*/
public int maxProfit(int[] prices) {
	int maxProfit = 0;
	int minStock = Integer.MAX_VALUE;
	for(int i = 0 ; i < prices.length-1 ; i++) {
		if (prices[i] < prices[i + 1] && prices[i] < minStock) {
			minStock = prices[i];
		}
		if(maxProfit < prices[i+1] - minStock){
			maxProfit = prices[i+1] - minStock;
		}
	}
	return maxProfit;
}