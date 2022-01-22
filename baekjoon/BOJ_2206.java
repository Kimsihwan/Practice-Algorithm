package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Main.Place;

/**
 * 이름 : 벽 부수고 이동하기
 * url : https://www.acmicpc.net/problem/2206
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2206 {

	static int N, M, ans;
	static int[][] map, visit;
	static int[] dx = { 1, 0, -1, 0 }; // 하 좌 상 우
	static int[] dy = { 0, 1, 0, -1 }; // 하 좌 상 우

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		N = Integer.parseInt(str[0]); // 행
		M = Integer.parseInt(str[1]); // 열

		map = new int[N][M];
		visit = new int[N][M];

		for (int i = 0; i < N; i++) {
			str = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(str[j]);
				visit[i][j] = Integer.MAX_VALUE;
			}
		}

		ans = Integer.MAX_VALUE;

		bfs(0, 0); // 출발점에서 bfs 시작
		
		if(ans == Integer.MAX_VALUE) System.out.println(-1);
		else System.out.println(ans);

		br.close();
	}

	static void bfs(int y, int x) {

		Queue<Place> q = new LinkedList<Main.Place>();

		q.add(new Place(y, x, 1, 0));
		visit[y][x] = 0;

		while (!q.isEmpty()) {

			Place cur = q.poll();

			// 도착지점에 만나면 종료
			if (cur.y == N - 1 && cur.x == M - 1) {
				ans = cur.dis;
				break;
			}

			for (int d = 0; d < 4; d++) {

				int ny = cur.y + dy[d];
				int nx = cur.x + dx[d];

				if (ny < 0 || nx < 0 || ny >= N || nx >= M)
					continue;

				// 방문체크
				if (visit[ny][nx] <= cur.drill)
					continue;

				// 벽이 아닐때
				if (map[ny][nx] == 0) {
					visit[ny][nx] = cur.drill;
					q.add(new Place(ny, nx, cur.dis + 1, cur.drill));
				} else {
					
					// 드릴을 사용 안했을 경우
					if (cur.drill == 0) {
						visit[ny][nx] = cur.drill + 1;
						q.add(new Place(ny, nx, cur.dis + 1, cur.drill + 1));
					}
				}

			}
		}

	}

	static class Place {

		private int x;

		private int y;

		private int dis; // 이동 거리

		private int drill; // 공사 횟수

		public Place(int y, int x, int dis, int drill) {
			this.y = y;
			this.x = x;
			this.dis = dis;
			this.drill = drill;
		}
	}
}