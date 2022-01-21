package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 단지번호붙이기
 * url : https://www.acmicpc.net/problem/2667
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2667 {

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		char[][] board = new char[n][n];
		int[][] vis = new int[n][n];

		for (int i = 0; i < n; i++) {
			char[] charArray = sc.next().toCharArray();
			for (int j = 0; j < n; j++) {
				board[i][j] = charArray[j];
			}
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (board[i][j] == '0' || vis[i][j] == 1)
					continue;

				int area = 0;
				Queue<Pair> q = new LinkedList<Pair>();
				q.offer(new Pair(i, j));
				vis[i][j] = 1;
				while (!q.isEmpty()) {
					Pair cur = q.poll();
					area++;
					for (int d = 0; d < 4; d++) {
						int x = cur.getX() + dx[d];
						int y = cur.getY() + dy[d];

						if (x < 0 || x >= n || y < 0 || y >= n)
							continue;
						if (board[x][y] == '0' || vis[x][y] == 1)
							continue;

						q.offer(new Pair(x, y));
						vis[x][y] = 1;
					}
				}
				list.add(area);
			}
		}

		System.out.println(list.size());

		Collections.sort(list);

		for (int a : list) {
			System.out.println(a);
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
