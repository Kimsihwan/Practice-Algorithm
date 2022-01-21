package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 스타트링크
 * url : https://www.acmicpc.net/problem/5014
 * 
 * @author kimsihwan
 *
 */
public class BOJ_5014 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int f = sc.nextInt();
		int s = sc.nextInt();
		int g = sc.nextInt();
		int u = sc.nextInt();
		int d = sc.nextInt();

		int[] vis = new int[f + g];

		Arrays.fill(vis, -1);
		vis[s] = 0;

		Queue<Integer> q = new LinkedList<>();
		q.offer(s);

		while (!q.isEmpty()) {
			Integer cur = q.poll();

			for (int nxt : Arrays.asList(cur - d, cur + u)) {
				if (nxt <= 0 || nxt > f || vis[nxt] != -1)
					continue;
				vis[nxt] = vis[cur] + 1;
				q.offer(nxt);
			}
		}

		if (vis[g] == -1) {
			System.out.println("use the stairs");
		} else {
			System.out.println(vis[g]);
		}

		sc.close();

	}
}