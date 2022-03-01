package programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 이름 : 2016년 
 * url : https://programmers.co.kr/learn/courses/30/lessons/12901
 * 
 * @author kimsihwan
 *
 */
public class pm_12901 {
	public String solution(int a, int b) {
		LocalDate localDate = LocalDate.of(2016, a, b);

		DayOfWeek dayOfWeek = localDate.getDayOfWeek();

		return dayOfWeek.name().substring(0, 3);
	}

}
