package programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 이름 : 서울에서 김서방 찾기
 * url : https://programmers.co.kr/learn/courses/30/lessons/12919
 * 
 * @author kimsihwan
 *
 */
public class pm_12919 {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i = 0 ; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 "+i+"에 있다";
                break;
            }
        }
        return answer;
    }

}
