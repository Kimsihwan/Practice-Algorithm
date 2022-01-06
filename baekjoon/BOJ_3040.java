package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 백설 공주와 일곱 난쟁이
 * url : https://www.acmicpc.net/problem/3040
 * 
 * @author kimsihwan
 *
 */
public class BOJ_3040 {

	static int[] n;
	static int r = 7;
	static int sum = 100;

	static int[] result = new int[r];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = new int[9];
		for (int i = 0; i < 9; i++) {
			n[i] = sc.nextInt();
		}

		// 1. DFS 트리를 이용
		// 2. 다음 Depth에서의 시작값
		// 3. 조합도 그냥 외운다.

		// 0 level, 0 BeginWith
		dfs(0, 0);
		
		sc.close();
	}

	private static void dfs(int level, int beginWith) {

		// 종료 조건
		if (level == r) {
			calc(result);
		} else {
			for (int i = beginWith; i < n.length; i++) {
				result[level] = n[i];
				dfs(level + 1, i + 1);
			}
		}
	}

	private static void calc(int[] rr) {
		if (rr[0] + rr[1] + rr[2] + rr[3] + rr[4] + rr[5] + rr[6] == sum) {
			for (int v : rr) {
				System.out.println(v);
			}
		}
	}
}
