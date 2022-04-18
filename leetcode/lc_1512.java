package leetcode;

import java.util.HashMap;

/**
 * 이름 : Number of Good Pairs
 * url : https://leetcode.com/problems/number-of-good-pairs/
 * 
 * @author kimsihwan
 *
 */
public class lc_1512 {

	// Hash Map
	// Time Complexity : O(n)
	// Space Complexity : O(n)
	public int numIdenticalPairs(int[] guestList){
		HashMap<Integer, Integer> hm = new HashMap<>();

		int ans = 0;

		for(int friend : guestList){
			int friendCnt = hm.getOrDefault(friend, 0);
			ans += friendCnt;
			hm.put(friend, friendCnt+1);
		}

		return ans;
	}
}
