package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 미로 탐색
 * url : https://www.acmicpc.net/problem/2178
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2178 {

	static char[][] board;
	static int[][] dist;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		board = new char[n][m];
		dist = new int[n][m];

		for (int i = 0; i < n; i++) {
			char[] charArray = sc.next().toCharArray();
			for (int j = 0; j < m; j++) {
				board[i][j] = charArray[j];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				dist[i][j] = -1;
			}
		}

		Queue<Pair> q = new LinkedList<Pair>();
		q.offer(new Pair(0, 0));
		dist[0][0] = 0;

		while (!q.isEmpty()) {
			Pair cur = q.poll();

			for (int d = 0; d < 4; d++) {
				int x = cur.getKey() + dx[d];
				int y = cur.getValue() + dy[d];

				if (x < 0 || x >= n || y < 0 || y >= m) continue;
				if (dist[x][y] >= 0 || board[x][y] == '0') continue;
				dist[x][y] = dist[cur.getKey()][cur.getValue()] + 1;
				q.offer(new Pair(x, y));
			}
		}
		
		System.out.println(dist[n - 1][m - 1] + 1);

		sc.close();
	}
}

class Pair {
	private int key;
	private int value;

	public Pair(int x, int y) {
		this.key = x;
		this.value = y;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}