package programmers;

/**
 * 이름 : 짝수와 홀수
 * url : https://programmers.co.kr/learn/courses/30/lessons/12937
 * 
 * @author kimsihwan
 *
 */
public class pm_12937 {
    public String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0){
            answer = "Even";
        }else{
            answer = "Odd";
        }
        return answer;
    }
}
