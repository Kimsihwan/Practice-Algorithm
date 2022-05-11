package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 이름 : Longest Common Prefix
 * url : https://leetcode.com/problems/longest-common-prefix/
 * 
 * @author kimsihwan
 *
 */
public class lc_14 {

	String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";

		Arrays.sort(strs);
		String first = strs[0];
		String last = strs[strs.length - 1];
		int c = 0;
		while(c < first.length())
		{
			if (first.charAt(c) == last.charAt(c))
				c++;
			else
				break;
		}
		return c == 0 ? "" : first.substring(0, c);
	}

}
