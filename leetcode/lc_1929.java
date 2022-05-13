package leetcode;

/**
 * 이름 : Concatenation of Array
 * url : https://leetcode.com/problems/concatenation-of-array/
 * 
 * @author kimsihwan
 *
 */
public class lc_1929 {

	public int[] getConcatenation(int[] nums) {

		int size = nums.length;
		int[] answer = new int[size*2];
		for (int i = 0; i < answer.length; i++) {

			if(size <= i){
				answer[i] = nums[i-size];
			}else{
				answer[i] = nums[i];
			}
		}
		return answer;
	}
}
