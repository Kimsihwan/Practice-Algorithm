package programmers;

import java.util.*;

/**
 * 이름 : 게임 맵 최단거리 
 * url : https://programmers.co.kr/learn/courses/30/lessons/1844
 * 
 * @author kimsihwan
 *
 */
public class pm_1844 {
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static boolean[][] vist;

	public int solution(int[][] maps) {
		int n = maps.length;
		int m = maps[0].length;
		vist = new boolean[n + 1][m];

		Queue<Pair> queue = new LinkedList<>();
		queue.offer(new Pair(0, 0, 1));
		vist[0][0] = true;

		while (!queue.isEmpty()) {
			Pair cur = queue.poll();

			for (int d = 0; d < 4; d++) {
				int nx = dx[d] + cur.x;
				int ny = dy[d] + cur.y;

				if (nx < 0 || ny < 0 || nx >= n || ny >= m)
					continue;

				if (maps[nx][ny] == 0 || vist[nx][ny])
					continue;

				vist[nx][ny] = true;
				int nextDist = cur.dist + 1;
				queue.offer(new Pair(nx, ny, nextDist));

				if (nx == n - 1 && ny == m - 1) {
					return nextDist;
				}
			}
		}

		return -1;
	}

	static class Pair {

		int x;
		int y;
		int dist;

		public Pair(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
	}
}
