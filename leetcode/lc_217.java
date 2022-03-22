package leetcode;

import java.util.HashMap;

/**
 * 이름 : Contains Duplicate
 * url : https://leetcode.com/problems/contains-duplicate/
 * 
 * @author kimsihwan
 *
 */
public class lc_217 {
	
	// HashMap
	// Time Complexity : O(n)
	// Space Complexity : O(n)
	public static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int v : nums) {
			if(map.containsKey(v)) return true;
			else map.put(v, v);
		}
		
		return false;
	}
}
