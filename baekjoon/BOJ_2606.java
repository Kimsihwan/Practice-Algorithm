package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 바이러스
 * url : https://www.acmicpc.net/problem/2606
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2606 {
	
	static boolean[] vist;
	static int[][] arr;
	static int vertex;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 꼭짓점
		vertex = sc.nextInt() + 1;
		// 차수
		int degree = sc.nextInt();

		arr = new int[vertex][vertex];
		vist = new boolean[vertex];

		for (int i = 0; i < degree; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = arr[y][x] = 1;
		}

		bfs(1);

		sc.close();
	}

	static void bfs(int depth) {
		int cnt = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(depth);
		vist[depth] = true;

		while (!queue.isEmpty()) {
			int cur = queue.poll();
			for (int d = 1; d < vertex; d++) {
				if (arr[cur][d] == 1 && !vist[d]) {
					queue.offer(d);
					vist[d] = true;
					cnt++;
				}
			}
		}
		System.out.println(cnt);

	}

}
