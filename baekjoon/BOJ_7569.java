package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 토마토
 * url : https://www.acmicpc.net/problem/7569
 * 
 * @author kimsihwan
 *
 */
public class BOJ_7569 {

	static int[] dx = { 1, 0, 0, -1, 0, 0 };
	static int[] dy = { 0, 1, 0, 0, -1, 0 };
	static int[] dz = { 0, 0, 1, 0, 0, -1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int h = sc.nextInt();

		int[][][] board = new int[h][n][m];
		int[][][] vis = new int[h][n][m];

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					vis[i][j][k] = -1;
				}
			}
		}

		Queue<Pair> q = new LinkedList<Pair>();

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					int tomato = sc.nextInt();
					board[i][j][k] = tomato;

					// 토마토거나 빈 박스 인 경우
					if (tomato != 0) {
						vis[i][j][k] = 0;
					}

					// 토마토가 있을 경우
					if (tomato == 1) {
						q.offer(new Pair(j, k, i));
					}
				}
			}
		}

		while (!q.isEmpty()) {
			Pair cur = q.poll();
			for (int d = 0; d < 6; d++) {
				int x = cur.getX() + dx[d];
				int y = cur.getY() + dy[d];
				int z = cur.getZ() + dz[d];

				// 범위 밖일 경우
				if (x < 0 || x >= n || y < 0 || y >= m || z < 0 || z >= h)
					continue;

				// 방문 했거나 빈박스인 경우
				if (vis[z][x][y] >= 0)
					continue;

				vis[z][x][y] = vis[cur.getZ()][cur.getX()][cur.getY()] + 1;
				q.offer(new Pair(x, y, z));
			}
		}

		int max = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (vis[i][j][k] == -1) {
						System.out.println(-1);
						return;
					}
					max = Math.max(max, vis[i][j][k]);
				}
			}
		}

		System.out.println(max);

		sc.close();

	}

}

class Pair {

	private int x;

	private int y;

	private int z;

	public Pair(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
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

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
