package programmers;

import java.util.*;

public class pm_42747 {
	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		int max = citations[citations.length-1];

		for(int i = max; i > -1; i--) {
			int a = 0;

			for(int v : citations) {
				if(v >= i) {
					a++;
				}
			}

			if(a >= i) {
				answer = i;
				break;
			}

		}

		return answer;
	}
}
