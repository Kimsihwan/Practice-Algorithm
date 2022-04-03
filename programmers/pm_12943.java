package programmers;

/**
 * 이름 : 콜라츠 추측
 * url : https://programmers.co.kr/learn/courses/30/lessons/12943
 * 
 * @author kimsihwan
 *
 */
public class pm_12943 {
    public int solution(int num) {
        int answer = 0;
        
        long a = (long) num;
        while(a != 1){
            if(answer == 500){
                return -1;
            }
            
            if(a % 2 == 0){
                a/=2;
            }else{
                a = (a*3) + 1;
            }
            answer++;
        }
        
        return answer;
    }

}
