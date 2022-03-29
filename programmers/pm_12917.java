package programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

/**
 * 이름 : 문자열 내림차순으로 배치하기
 * url : https://programmers.co.kr/learn/courses/30/lessons/12917
 * 
 * @author kimsihwan
 *
 */
public class pm_12903 {
    public String solution(String s) {
		char[] arr = s.toCharArray();
		
		
		Arrays.sort(arr);
		
		
		StringBuilder sb = new StringBuilder();
		
		for(char v : arr) {
			sb.append(v);
		}
		
		return sb.reverse().toString();
    }

}
