package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : N과 M (3)
 * url : https://www.acmicpc.net/problem/15651
 * 
 * @author kimsihwan
 *
 */
public class BOJ_15651 {

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] board1 = new char[n][n];
		char[][] board2 = new char[n][n];
		boolean[][] vis1 = new boolean[n][n];
		boolean[][] vis2 = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			char[] charArray = sc.next().toCharArray();
			for (int j = 0; j < n; j++) {
				board1[i][j] = charArray[j];
				if (charArray[j] == 'G') {
					board2[i][j] = 'R';
				} else {
					board2[i][j] = charArray[j];
				}
			}
		}

		int cnt1 = 0;
		int cnt2 = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (vis1[i][j])
					continue;
				vis1[i][j] = true;

				Queue<Pair> q1 = new LinkedList<Pair>();
				q1.offer(new Pair(i, j));
				cnt1++;

				while (!q1.isEmpty()) {
					Pair cur = q1.poll();
					for (int d = 0; d < 4; d++) {
						int x = cur.getX() + dx[d];
						int y = cur.getY() + dy[d];

						if (x < 0 || x >= n || y < 0 || y >= n)
							continue;

						if (vis1[x][y] || board1[x][y] != board1[cur.getX()][cur.getY()])
							continue;

						vis1[x][y] = true;
						q1.offer(new Pair(x, y));
					}
				}

			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (vis2[i][j])
					continue;
				vis2[i][j] = true;

				Queue<Pair> q1 = new LinkedList<Pair>();
				q1.offer(new Pair(i, j));
				cnt2++;

				while (!q1.isEmpty()) {
					Pair cur = q1.poll();
					for (int d = 0; d < 4; d++) {
						int x = cur.getX() + dx[d];
						int y = cur.getY() + dy[d];

						if (x < 0 || x >= n || y < 0 || y >= n)
							continue;

						if (vis2[x][y] || board2[x][y] != board2[cur.getX()][cur.getY()])
							continue;

						vis2[x][y] = true;
						q1.offer(new Pair(x, y));
					}
				}

			}
		}

		System.out.println(cnt1);
		System.out.println(cnt2);
		
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
