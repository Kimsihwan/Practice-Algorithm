package programmers;

import java.util.ArrayList;
import java.util.List;

public class pm_12953 {
	public int solution(int[] arr) {
		int answer = 0;

		if(arr.length == 1) return arr[0];

		int gcd = gcd(arr[0], arr[1]);
		answer = (arr[0] * arr[1]) / gcd;

		if(arr.length > 2) {
			for(int i = 2; i < arr.length; i++){
				gcd = gcd(answer, arr[i]);
				answer = (answer * arr[i]) / gcd;
			}
		}


		return answer;
	}

	public int gcd(int a, int b) {
		if(b == 0) return a;
		else return gcd(b, a%b);
	}

}
