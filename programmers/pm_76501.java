package programmers;

/**
 * 이름 : 음양 더하기
 * url : https://programmers.co.kr/learn/courses/30/lessons/76501
 * 
 * @author kimsihwan
 *
 */
public class pm_76501 {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int num : numbers){
            answer -= num;
        }
        
        return answer;
    }
}
