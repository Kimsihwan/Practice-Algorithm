package programmers;

/**
 * 이름 : 약수의 개수와 덧셈 
 * url : https://programmers.co.kr/learn/courses/30/lessons/77884
 * 
 * @author kimsihwan
 *
 */
public class pm_77884 {

	public int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {

			if (i % Math.sqrt(i) == 0) {
				answer -= i;
			} else {
				answer += i;
			}

		}

		return answer;
	}

}
