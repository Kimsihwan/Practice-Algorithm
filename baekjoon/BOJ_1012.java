package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 유기농 배추
 * url : https://www.acmicpc.net/problem/1012
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10156 {

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		// 테스트케이스
		for (int i = 0; i < t; i++) {

			int m = sc.nextInt();
			int n = sc.nextInt();
			int k = sc.nextInt();

			int[][] board = new int[n][m];
			boolean[][] vis = new boolean[n][m];

			// 배추 위치 설정
			for (int j = 0; j < k; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				board[y][x] = 1;
			}

			int count = 0;
			for (int a = 0; a < n; a++) {
				for (int b = 0; b < m; b++) {
					if (board[a][b] == 0 || vis[a][b]) continue;
					count++;

					Queue<Pair> q = new LinkedList<Pair>();
					q.offer(new Pair(a, b));
					vis[a][b] = true;
					while (!q.isEmpty()) {
						Pair cur = q.poll();
						for (int d = 0; d < 4; d++) {
							int x = cur.getX() + dx[d];
							int y = cur.getY() + dy[d];

							if (x < 0 || x >= n || y < 0 || y >= m) continue;
							if (board[x][y] == 0 || vis[x][y]) continue;
							vis[x][y] = true;
							q.offer(new Pair(x, y));
						}
					}
				}
			}
			System.out.println(count);
		}
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
