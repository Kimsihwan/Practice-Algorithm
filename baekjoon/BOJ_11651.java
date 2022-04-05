package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * 이름 : 좌표 정렬하기 2
 * url : https://www.acmicpc.net/problem/11651
 * 
 * @author kimsihwan
 *
 */
public class BOJ_11651 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		List<Pair> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			list.add(new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		
		
		list = list.stream().sorted((o1, o2) -> {
			if(o1.y != o2.y)
				return o1.y - o2.y;
			else
				return o1.x - o2.x;
		}).collect(Collectors.toList());
		
		for(Pair pair : list) {
			System.out.println(pair.x + " " + pair.y);
		}
	}

	static class Pair {
		int x;
		int y;
		
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

}
