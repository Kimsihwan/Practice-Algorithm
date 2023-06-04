package programmers;

import java.util.*;

public class pm_42885 {
	public int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);

		int i = 0;
		int j = people.length-1;
		while(i <= j) {
			if(people[i]+people[j] <= limit) {
				i++;
			}
			j--;
			answer++;
		}

		return answer;
	}
}
