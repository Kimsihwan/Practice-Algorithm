package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 나이트의 이동
 * url : https://www.acmicpc.net/problem/7562
 * 
 * @author kimsihwan
 *
 */
public class BOJ_7562 {

	// 왼위, 오위, 왼아, 오아
	static int[] dx = { -1, -2, -2, -1, 1, 2, 1, 2 };
	static int[] dy = { -2, -1, 1, 2, -2, -1, 2, 1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		for (int i = 0; i < tc; i++) {

			int size = sc.nextInt();

			int[][] board = new int[size][size];

			for (int j = 0; j < size; j++) {
				for (int k = 0; k < size; k++) {
					board[j][k] = -1;
				}
			}

			int nightX = sc.nextInt();
			int nightY = sc.nextInt();
			int targetX = sc.nextInt();
			int targetY = sc.nextInt();

			board[nightX][nightY] = 0;
			Queue<Pair> q = new LinkedList<Pair>();
			q.offer(new Pair(nightX, nightY));

			while (!q.isEmpty()) {
				Pair cur = q.poll();

				for (int d = 0; d < 8; d++) {
					int x = cur.getX() + dx[d];
					int y = cur.getY() + dy[d];

					// 범위 밖이면 continue
					if (x < 0 || x >= size || y < 0 || y >= size)
						continue;

					// 방문 했던 곳이면 continue
					if (board[x][y] >= 0)
						continue;

					board[x][y] = board[cur.getX()][cur.getY()] + 1;
					q.offer(new Pair(x, y));
				}
			}

			System.out.println(board[targetX][targetY]);

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
