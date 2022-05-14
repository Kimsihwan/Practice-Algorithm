package leetcode;

/**
 * 이름 : Build Array from Permutation
 * url : https://leetcode.com/problems/build-array-from-permutation/
 * 
 * @author kimsihwan
 *
 */
public class lc_1920 {
	public int[] buildArray(int[] nums) {
		int[] ans = new int[nums.length];
		for(int i = 0; i < nums.length; i++)
			ans[i] = nums[nums[i]];
		return ans;
	}
}
