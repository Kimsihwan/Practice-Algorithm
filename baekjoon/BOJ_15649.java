package baekjoon;

import java.util.Scanner;

/**
 * 이름 : N과 M (1)
 * url : https://www.acmicpc.net/problem/15649
 * 
 * @author kimsihwan
 *
 */
public class BOJ_15649 {

	input();

	arr = new int[m];
	visit = new boolean[n];

	dfs(0);
}

static void dfs(int depth) {
	// 기저 사례 : 노드의 끝에 닿았을경우
	if (depth == m) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		return;
	}

	for (int i = 0; i < n; i++) {
		if(!visit[i]) {
			visit[i] = true;
			arr[depth] = i + 1;
			dfs(depth+1);
			visit[i] = false;
		}
	}
}

static void input() {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	m = sc.nextInt();
	sc.close();
}
