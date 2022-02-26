package programmers;

/**
 * 이름 : 3진법 뒤집기 
 * url : https://programmers.co.kr/learn/courses/30/lessons/68935
 * 
 * @author kimsihwan
 *
 */
public class pm_68935 {

	public int solution(int n) {
		String str = "";
		while (n > 0) {
			str += (n%3);
			n /= 3;
		}

		return Integer.parseInt(str, 3);
	}

}
