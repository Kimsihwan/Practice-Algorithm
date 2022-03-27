package programmers;

/**
 * 이름 : 두 정수 사이의 합
 * url : https://programmers.co.kr/learn/courses/30/lessons/12912
 * 
 * @author kimsihwan
 *
 */
public class pm_12912 {
    public long solution(int a, int b) {
        long answer = 0;
        
        int temp = 0;
        if(a>b){
            temp = a;
            a = b;
            b = temp;
        }
        
        for(int i = a; i <= b; i++){
            answer+=i;
        }
        return answer;
    }

}
