package programmers;

/**
 * 이름 : 없는 숫자 더하기
 * url : https://programmers.co.kr/learn/courses/30/lessons/86051
 * 
 * @author kimsihwan
 *
 */
public class pm_86051 {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int num : numbers){
            answer -= num;
        }
        
        return answer;
    }
}
