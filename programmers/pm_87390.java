package programmers;

import java.util.Arrays;

public class pm_87390 {
	public int[] solution(int n, long left, long right) {

		int[] answer = new int[(int)(right-left)+1];

		int index = 0;
		for(long i = left; i <= right; i++ ) {
			answer[index++] = (int) Math.max((i/n)+1, i%n+1);
		}

		return answer;
	}
}
