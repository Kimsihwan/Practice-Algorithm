package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 안전 영역
 * url : https://www.acmicpc.net/problem/2468
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2468 {

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] board = new int[n][n];

		int maxLimit = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
				maxLimit = Math.max(maxLimit, board[i][j]);
			}
		}

		int max = 0;
		for (int limit = 0; limit <= maxLimit; limit++) {
			int[][] vis = new int[n][n];

			int cnt = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					// 침수 여부, 방문 여부
					if (board[i][j] > limit && vis[i][j] == 0) {
						Queue<Pair> q = new LinkedList<Pair>();
						q.offer(new Pair(i, j));
						vis[i][j] = 1;

						while (!q.isEmpty()) {
							Pair cur = q.poll();

							for (int d = 0; d < 4; d++) {
								int x = cur.getX() + dx[d];
								int y = cur.getY() + dy[d];

								if (x < 0 || x >= n || y < 0 || y >= n)
									continue;
								// 침수, 방문 여부
								if (board[x][y] > limit && vis[x][y] == 0) {
									q.offer(new Pair(x, y));
									vis[x][y] = 1;
								}
							}
						}
						cnt++;
					}
				}
			}

			max = Math.max(max, cnt);
		}
		
		System.out.println(max);

		sc.close();

	}
}

class Pair {

	private int x;

	private int y;

	public Pair(int x, int y) {
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
