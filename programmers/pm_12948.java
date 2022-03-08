package programmers;

/**
 * 이름 : 핸드폰 번호 가리기 
 * url : https://programmers.co.kr/learn/courses/30/lessons/12948
 * 
 * @author kimsihwan
 *
 */
public class pm_12948 {
	public String solution(String phone_number) {
        String answer = "";
        char[] a = phone_number.toCharArray();
		for (int i = 0; i < a.length - 4; i++) {
			answer+="*";
        }		
		String substring = phone_number.substring(a.length - 4, a.length);
        return answer+substring;
    }
}
