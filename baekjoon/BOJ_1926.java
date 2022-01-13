package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 그림
 * url : https://www.acmicpc.net/problem/1926
 * 
 * @author kimsihwan
 *
 */
public class BOJ_1926 {

	static int[][] board = new int[502][502];
	static boolean[][] vis = new boolean[502][502];
	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		int max = 0; // 그림의 최댓값
		int num = 0; // 그림의 수

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (board[i][j] == 0 || vis[i][j])
					continue;
				num++;
				Queue<Pair> q = new LinkedList<>();
				vis[i][j] = true;
				q.add(new Pair(i, j));
				int area = 0;
				while (!q.isEmpty()) {
					area++;
					Pair cur = q.poll();
					for (int dir = 0; dir < 4; dir++) {
						int nx = cur.key + dx[dir];
						int ny = cur.value + dy[dir];
						if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
						if(vis[nx][ny] || board[nx][ny] != 1) continue;
						vis[nx][ny] = true;
						q.add(new Pair(nx, ny));
					}
				}
				max = Math.max(max, area);
			}
		}
		
		System.out.println(num);
		System.out.println(max);
		sc.close();

	}

}

class Pair {
	Integer key;
	Integer value;

	public Pair(Integer key, Integer value) {
		this.key = key;
		this.value = value;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}