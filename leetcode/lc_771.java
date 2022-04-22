package leetcode;

/**
 * 이름 : Jewels and Stones
 * url : https://leetcode.com/problems/jewels-and-stones/
 * 
 * @author kimsihwan
 *
 */
public class lc_771 {

	public int numJewelsInStones(String J, String S) {
		return S.replaceAll("[^" + J + "]", "").length();
	}
}
