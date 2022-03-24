package programmers;

/**
 * 이름 : 문자열 내 p와 y의 개수 
 * url : https://programmers.co.kr/learn/courses/30/lessons/12916
 * 
 * @author kimsihwan
 *
 */
public class pm_12916 {
	public boolean solution(String s) {
        s = s.toLowerCase();
        int answer = 0;
		for(int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
            if(charAt == 'p'){
                answer++;
            }else if(charAt == 'y'){
                answer--;
            }
		}
        
        if(answer == 0){
            return true;
        }
        
		return false;
    }

}
