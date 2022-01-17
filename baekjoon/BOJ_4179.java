package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 불!
 * url : https://www.acmicpc.net/problem/4179
 * 
 * @author kimsihwan
 *
 */
public class BOJ_4179 {

	static char[][] board;

	static int[][] fVis;
	static int[][] jVis;

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		int r = sc.nextInt();

		board = new char[c][r];
		fVis = new int[c][r];
		jVis = new int[c][r];

		Queue<Pair> jq = new LinkedList<Pair>();
		Queue<Pair> fq = new LinkedList<Pair>();

		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				fVis[i][j] = -1;
				jVis[i][j] = -1;
			}
		}

		for (int i = 0; i < c; i++) {
			char[] charArray = sc.next().toCharArray();
			for (int j = 0; j < r; j++) {
				board[i][j] = charArray[j];

				if (charArray[j] == 'J') {
					jq.offer(new Pair(i, j));
					jVis[i][j] = 0;
				}

				if (charArray[j] == 'F') {
					fq.offer(new Pair(i, j));
					fVis[i][j] = 0;
				}
			}
		}

		// 불쪽 먼저 탐색
		while (!fq.isEmpty()) {
			Pair cur = fq.poll();

			for (int d = 0; d < 4; d++) {
				int x = cur.getX() + dx[d];
				int y = cur.getY() + dy[d];

				if (x < 0 || x >= c || y < 0 || y >= r)
					continue;

				if (fVis[x][y] >= 0 || board[x][y] == '#')
					continue;

				fVis[x][y] = fVis[cur.getX()][cur.getY()] + 1;
				fq.offer(new Pair(x, y));
			}

		}

		while (!jq.isEmpty()) {
			Pair cur = jq.poll();

			for (int d = 0; d < 4; d++) {
				int x = cur.getX() + dx[d];
				int y = cur.getY() + dy[d];

				if (x < 0 || x >= c || y < 0 || y >= r) {
					System.out.println(jVis[cur.getX()][cur.getY()] + 1);
					return;
				}

				if (jVis[x][y] >= 0 || board[x][y] == '#')
					continue;
				if (fVis[x][y] != -1 && fVis[x][y] <= jVis[cur.getX()][cur.getY()] + 1)
					continue;
				jVis[x][y] = jVis[cur.getX()][cur.getY()] + 1;
				jq.offer(new Pair(x, y));
			}

		}
		System.out.println("IMPOSSIBLE");

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
