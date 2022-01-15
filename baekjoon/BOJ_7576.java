package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 토마토
 * url : https://www.acmicpc.net/problem/7576
 * 
 * @author kimsihwan
 *
 */
public class BOJ_7576 {

	static int[][] board;
	static int[][] dist;
	static int n, m;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		board = new int[n][m];
		dist = new int[n][m];

		Queue<Pair2> q = new LinkedList<Pair2>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				board[i][j] = sc.nextInt();
				if (board[i][j] == 1) {
					q.offer(new Pair2(i, j));
				}

				if (board[i][j] == 0) {
					dist[i][j] = -1;
				}
			}
		}

		while (!q.isEmpty()) {
			Pair2 cur = q.poll();

			for (int d = 0; d < 4; d++) {

				int x = cur.getX() + dx[d];
				int y = cur.getY() + dy[d];

				if (x < 0 || x >= n || y < 0 || y >= m)
					continue;

				if (dist[x][y] >= 0)
					continue;

				dist[x][y] = dist[cur.getX()][cur.getY()] + 1;
				q.offer(new Pair2(x, y));
			}
		}

		int ans = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (dist[i][j] == -1) {
					System.out.println(-1);
					return;
				}

				ans = Math.max(ans, dist[i][j]);
			}
		}

		System.out.println(ans);
		sc.close();
	}
}

class Pair2 {

	private int x;
	private int y;

	public Pair2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
