package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 이름 : Two Sum
 * url : https://leetcode.com/problems/two-sum/
 * 
 * @author kimsihwan
 *
 */
public class lc_1 {

	// Brute Force
	// Time Complexity : O(n2)
	// Space Complexity : O(1)
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}
	
	// Hash Map
	// Time Complexity : O(n)
	// Space Complexity : O(n) => 최악의 경우 맵에 모든값을 저장해야하기 때문
	public static int[] twoSum2(int[] nums, int target) {
		HashMap<Integer, Integer> indexMap = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			Integer requiredNum  = (Integer) (target- nums[i]);
			if(indexMap.containsKey(requiredNum)) {
				int toReturn[] = {indexMap.get(requiredNum), i};
				return toReturn;
			}
			indexMap.put(nums[i], i);
		}
		return null;
	}
}
