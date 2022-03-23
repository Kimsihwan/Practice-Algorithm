package programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 이름 : 문자열 다루기 기본 
 * url : https://programmers.co.kr/learn/courses/30/lessons/12918
 * 
 * @author kimsihwan
 *
 */
public class pm_12901 {
    public boolean solution(String s) {
		if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) < '0' || s.charAt(i) > '9') return false;
            }
            return true;
        }
		return false;
    }
}
