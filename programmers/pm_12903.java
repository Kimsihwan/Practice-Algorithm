package programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 이름 : 가운데 글자 가져오기
 * url : https://programmers.co.kr/learn/courses/30/lessons/12903
 * 
 * @author kimsihwan
 *
 */
public class pm_12903 {
    public String solution(String s) {
        String answer = "";
        
        int a = s.length() / 2;
        if(s.length() % 2 != 0){
            answer = s.substring(a, a +1 );
        }else {
            answer = s.substring(a-1, a+1);
        }
        
        
        return answer;
    }

}
