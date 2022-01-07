package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 블랙잭
 * url : https://www.acmicpc.net/problem/2798
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2798 {

	static int r = 3;
	static int[] arr;
	static int[] result = new int[r];
	static int sum;
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sum = sc.nextInt();

		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		dfs(0, 0);
		System.out.println(max);
		sc.close();
	}

	private static void dfs(int level, int beginwith) {
		if (level == r) {
			calc();
		} else {
			for (int i = beginwith; i < arr.length; i++) {
				result[level] = arr[i];
				dfs(level + 1, i + 1);
			}
		}
	}

	private static void calc() {
		int total = result[0] + result[1] + result[2];
		if (total <= sum && max < total) {
			Math.max(total, total);
			max = total;
		}
	}
}
