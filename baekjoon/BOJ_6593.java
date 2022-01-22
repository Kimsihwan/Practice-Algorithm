package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 상범 빌딩
 * url : https://www.acmicpc.net/problem/6593
 * 
 * @author kimsihwan
 *
 */
public class BOJ_6593 {

	static int[] dx = { 1, 0, 0, -1, 0, 0 };
	static int[] dy = { 0, 1, 0, 0, -1, 0 };
	static int[] dz = { 0, 0, 1, 0, 0, -1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();

		// l, r, c 모두 0일 경우 종료 처리
		while (l != 0 && r != 0 && c != 0) {
			char[][][] building = new char[l][r][c];
			int[][][] vis = new int[l][r][c];

			Queue<Pair> q = new LinkedList<Pair>();
			boolean escape = false;
			int dist = 0;

			for (int h = 0; h < l; h++) {
				for (int x = 0; x < r; x++) {
					char[] charArray = sc.next().toCharArray();
					for (int y = 0; y < c; y++) {
						vis[h][x][y] = -1;

						building[h][x][y] = charArray[y];
						if (building[h][x][y] == 'S') {
							q.offer(new Pair(x, y, h));
							vis[h][x][y] = 0;
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

					if (x < 0 || x >= r || y < 0 || y >= c || z < 0 || z >= l)
						continue;
					if (building[z][x][y] == '#' || vis[z][x][y] != -1)
						continue;

					if (building[z][x][y] == 'E') {
						escape = true;
						dist = vis[cur.getZ()][cur.getX()][cur.getY()] + 1;
						break;
					}

					q.offer(new Pair(x, y, z));
					vis[z][x][y] = vis[cur.getZ()][cur.getX()][cur.getY()] + 1;
				}
			}

			if (escape) {
				System.out.println("Escaped in " + dist + " minute(s).");
			} else {
				System.out.println("Trapped!");
			}

			l = sc.nextInt();
			r = sc.nextInt();
			c = sc.nextInt();
		}
		
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
