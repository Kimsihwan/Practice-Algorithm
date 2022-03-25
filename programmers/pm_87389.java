package programmers;

/**
 * 이름 : 나머지가 1이 되는 수 찾기
 * url : https://programmers.co.kr/learn/courses/30/lessons/87389
 * 
 * @author kimsihwan
 *
 */
public class pm_87389 {
    public int solution(int n) {
        int answer = 0;
        
        int x = 0;
        while(answer != 1){
            x++;
            answer = n%x;            
        }
        
        return x;
    }

}
