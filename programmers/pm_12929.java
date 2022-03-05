package programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 이름 : 올바른 괄호의 개수
 * url : https://programmers.co.kr/learn/courses/30/lessons/12929
 * 
 * @author kimsihwan
 *
 */
public class pm_12929 {
	static int count;

	public int solution(int n) {
		count = 0;

		dfs(0, 0, n);

		return count;
	}

	private void dfs(int left, int right, int n) {
		if (left < right) return;
		if (left == n && right == n) {
			count++;
			return;
		}

		if (left > n || right > n) return;

		dfs(left + 1, right, n);
		dfs(left, right + 1, n);
	}

}
