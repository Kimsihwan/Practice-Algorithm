package programmers;

/**
 * 이름 : 124 나라의 숫자
 * url : https://programmers.co.kr/learn/courses/30/lessons/12899
 * 
 * @author kimsihwan
 *
 */
public class pm_12899 {
	public String solution(int n) {
        String[] numbers = {"4","1","2"};
        String answer = "";
        
        while(n > 0){
            int reminder = n % 3;
            n /= 3;
            if(reminder==0) n--;
            
            answer = numbers[reminder] + answer;
        }
        return answer;
    }

}
