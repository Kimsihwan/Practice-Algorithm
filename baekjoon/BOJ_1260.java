package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : DFS와 BFS
 * url : https://www.acmicpc.net/problem/1260
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10026 {

	static int n, m, init;

	static int[][] arr;

	static boolean[] cheked;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt() + 1;
		m = sc.nextInt();
		init = sc.nextInt();

		cheked = new boolean[n];

		arr = new int[n][n];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}

		dfs(init);
		System.out.println();
		// 초기화
		cheked = new boolean[n];
		bfs(init);

		sc.close();
	}

	static void dfs(int depth) {
		cheked[depth] = true;
		System.out.print(depth + " ");

		for (int j = 1; j < n; j++) {
			if (arr[depth][j] == 1 && !cheked[j]) {
				dfs(j);
			}
		}
	}

	static void bfs(int depth) {
		Queue<Integer> que = new LinkedList<>();
		que.offer(depth);
		cheked[depth] = true;
		System.out.print(depth + " ");

		while (!que.isEmpty()) {
			int cur = que.poll();

			for (int j = 1; j < n; j++) {
				if (arr[cur][j] == 1 && !cheked[j]) {
					que.offer(j);
					cheked[j] = true;
					System.out.print(j+" ");
				}
			}
		}
		System.out.println();
	}
}
