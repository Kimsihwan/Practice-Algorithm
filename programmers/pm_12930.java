package programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 이름 : 이상한 문자 만들기
 * url : https://programmers.co.kr/learn/courses/30/lessons/12930
 * 
 * @author kimsihwan
 *
 */
public class pm_12901 {
	public String solution(int a, int b) {
		StringBuilder sb = new StringBuilder();

		int index = 0;
		for (char v : s.toLowerCase().toCharArray()) {

			if (v == ' ') {
				index = 0;
				sb.append(v);
				continue;
			}

			if (v >= 'a' && v <= 'z' && index % 2 == 0) {
				sb.append((char) (v - 32));
			} else {
				sb.append(v);
			}
			index++;
		}

		return sb.toString()
	}

}
