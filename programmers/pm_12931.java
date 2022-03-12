package programmers;

/**
 * 이름 : 자릿수 더하기
 * url : https://programmers.co.kr/learn/courses/30/lessons/12931
 * 
 * @author kimsihwan
 *
 */
public class pm_12931 {
    public int solution(int n) {
        
        String str = String.valueOf(n);
        
        String[] a = str.split("");
        
        int answer = 0;
        for(String v : a){
            answer += Integer.valueOf(v);
        }

        return answer;
    }

}
