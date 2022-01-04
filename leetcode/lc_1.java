package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : Two Sum
 * url : https://leetcode.com/problems/two-sum/
 * 
 * @author kimsihwan
 *
 */
public class BOJ_8393 {

	public int[] twoSum(int[] nums, int target) {
		int[] rs = null;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (i != j && nums[i] + nums[j] == target) {
					rs = new int[] { i, j };
					break;
				}
			}
		}
		return rs;
	}
}
