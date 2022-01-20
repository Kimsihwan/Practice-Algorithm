package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 불
 * url : https://www.acmicpc.net/problem/5427
 * 
 * @author kimsihwan
 *
 */
public class BOJ_5427 {

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		for (int testNo = 0; testNo < tc; testNo++) {

			boolean escape = false;

			Queue<Pair> qf = new LinkedList<Pair>();
			Queue<Pair> qs = new LinkedList<Pair>();

			int bY = sc.nextInt();
			int bX = sc.nextInt();

			int[][] board = new int[bX][bY];
			int[][] visF = new int[bX][bY];
			int[][] visS = new int[bX][bY];

			for (int i = 0; i < bX; i++) {
				char[] cr = sc.next().toCharArray();
				for (int j = 0; j < bY; j++) {
					if (cr[j] == '#')
						board[i][j] = -1;
					else {
						if (cr[j] == '@') {
							qs.offer(new Pair(i, j));
							visS[i][j] = 1;
						} else if (cr[j] == '*') {
							qf.offer(new Pair(i, j));
							visF[i][j] = 1;
						}
						board[i][j] = 0;
					}
				}
			}

			while (!qf.isEmpty()) {
				Pair cur = qf.poll();

				for (int d = 0; d < 4; d++) {
					int x = cur.getX() + dx[d];
					int y = cur.getY() + dy[d];

					// 범위를 넘었을 경우
					if (x < 0 || x >= bX || y < 0 || y >= bY)
						continue;

					// 벽일 경우
					if (board[x][y] == -1)
						continue;

					// 방문했을 경우
					if (visF[x][y] > 0)
						continue;

					visF[x][y] = visF[cur.getX()][cur.getY()] + 1;
					qf.offer(new Pair(x, y));
				}
			}

			while (!qs.isEmpty() && !escape) {
				Pair c = qs.poll();

				for (int d = 0; d < 4; d++) {
					int x = c.getX() + dx[d];
					int y = c.getY() + dy[d];

					// 범위 밖인 경우는 탈출했다는 뜻
					if (x < 0 || x >= bX || y < 0 || y >= bY) {
						System.out.println(visS[c.getX()][c.getY()]);
						escape = true;
						break;
					}

					// 벽일 경우
					if (board[x][y] == -1)
						continue;

					// 방문을 했을 경우
					if (visS[x][y] > 0)
						continue;

					// 불이 번졌거나 동시에 불이 번지고 도착했을 경우
					if (visF[x][y] != 0 && visF[x][y] <= visS[c.getX()][c.getY()] + 1)
						continue;
					visS[x][y] = visS[c.getX()][c.getY()] + 1;
					qs.offer(new Pair(x, y));

				}
			}
			if (!escape) {
				System.out.println("IMPOSSIBLE");
			}
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
