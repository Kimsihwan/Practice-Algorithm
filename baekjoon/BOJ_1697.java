package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 숨바꼭질
 * url : https://www.acmicpc.net/problem/1697
 * 
 * @author kimsihwan
 *
 */
public class BOJ_1697 {

	static int[] dist = new int[100002];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		Arrays.fill(dist, -1);

		dist[n] = 0;

		Queue<Integer> q = new LinkedList<Integer>();

		q.offer(n);

		// 동생이 위치해있는 값이 바뀔때까지만
		while (dist[k] == -1) {
			Integer cur = q.poll();

			for (int nxt : Arrays.asList(cur - 1, cur, cur + 1, 2 * cur)) {
				if (nxt < 0 || nxt > 100000)
					continue;
				if (dist[nxt] != -1)
					continue;
				dist[nxt] = dist[cur] + 1;
				q.offer(nxt);
			}
		}

		System.out.println(dist[k]);

		sc.close();
	}

}