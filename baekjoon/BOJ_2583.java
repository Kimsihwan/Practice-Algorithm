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
 * 이름 : 영역 구하기
 * url : https://www.acmicpc.net/problem/2583
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2583 {

	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[][] board = new int[m][n];

		for (int i = 0; i < k; i++) {
			int ly = sc.nextInt();
			int lx = sc.nextInt();

			int ry = sc.nextInt();
			int rx = sc.nextInt();

			for (int a = lx; a < rx; a++) {
				for (int b = ly; b < ry; b++) {
					board[(m - 1) - a][b] = 1;
				}
			}
		}
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 1) continue;
				Queue<Pair> q = new LinkedList<Pair>();
				q.offer(new Pair(i, j));
				board[i][j] = 1;
				int area = 0;
				int max = 0;
				while (!q.isEmpty()) {
					Pair cur = q.poll();
					area++;
					for (int d = 0; d < 4; d++) {
						int x = cur.getX() + dx[d];
						int y = cur.getY() + dy[d];

						if (x < 0 || x >= m || y < 0 || y >= n)
							continue;

						if (board[x][y] == 1)
							continue;

						q.offer(new Pair(x, y));
						board[x][y] = 1;
					}
					max = Math.max(max, area);
				}
				list.add(max);
			}
		}
		
		
		System.out.println(list.size());
		
		Collections.sort(list);
		
		for(int a : list) {
			System.out.print(a+" ");
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
