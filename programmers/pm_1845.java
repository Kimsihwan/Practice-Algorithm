package programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 이름 : 폰켓몬
 * url : https://programmers.co.kr/learn/courses/30/lessons/1845
 * 
 * @author kimsihwan
 *
 */
public class pm_12901 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int v : nums) {
			set.add(v);
		}
		
		
		int max = nums.length / 2;
		int size = set.size();
		if (max < size) {
			return max;
		}else {
			return size;
		}
    }

}
