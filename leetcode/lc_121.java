package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 이름 : Best Time to Buy and Sell Stock
 * url : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * @author kimsihwan
 *
 */
public class lc_121 {

	// Brute Force(시간초과)
	// Time Complexity : O(n2)
	// Space Complexity : O(1) => 두가지 변수만 사용
	public static int maxProfit(int[] prices) {
		int maxProfit = 0;

		for (int i = 0; i < prices.length-1; i++) {
			for(int j = 1; j < prices.length; j++) {
				maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
			}
		}
		return maxProfit;
	}
	
	// One pass
	// Time Complexity : O(n)
	// Space Complexity : O(1) => 두 개의 변수만 사용
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			if(prices[i] < minPrice) {
				minprice = prices[i];
			} else if(prices[i] - minprice > maxProfit) {
				maxProfit = prices[i] - minprice;
			}
		}
		return maxProfit;
	}
}
