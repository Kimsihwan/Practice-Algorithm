package programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 이름 : 위장
 * url : https://programmers.co.kr/learn/courses/30/lessons/42578
 * 
 * @author kimsihwan
 *
 */
public class pm_42578 {
	public int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < clothes.length; i++) {
			hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
		}
		for(String key : hm.keySet()) {
			answer *=(hm.get(key)+1);
		}
		answer -= 1;
		return answer;
	}

}
