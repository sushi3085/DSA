// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

// On each day, you may decide to buy and/or sell the stock.
// You can only hold at most one share of the stock at any time.
// However, you can buy it then immediately sell it on the same day.

// Find and return the maximum profit you can achieve.

public class Solution{
	public int solve(int[] prices){
		int[][] dp = new int[prices.length][prices.length];
		for(int i=0, j=0; i<prices.length; i++, j++)
			dp[i][j] = 0;
		for(int j=0; j<prices.length; j++){
			for(int i=j-1; i>=0; i--){
				dp[i][j] = Math.max(dp[i][j-1],/* */);
			}
		}
		
	}
}