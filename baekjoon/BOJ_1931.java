package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import Main.Pair;

/**
 * 이름 : 회의실 배정
 * url : https://www.acmicpc.net/problem/1931
 * 
 * @author kimsihwan
 *
 */
public class BOJ_1931 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Pair> list = new ArrayList<Main.Pair>();

		for (int i = 0; i < n; i++) {
			list.add(new Pair(sc.nextInt(), sc.nextInt()));
		}

		// 끝나는 시간 순으로 정렬
		Collections.sort(list, (o1, o2) -> {
			// 끝나는 시간이 같을 경우 시작시간이 빠른순으로 정렬(끝나고 바로 시작하는경우 땜에)
			if (o1.second == o2.second) {
				return o1.first - o2.first;
			} else {
				return o1.second - o2.second;
			}
		});

		int ans = 0;
		int prev_end_time = 0;
		for (Pair x : list) {
			
			// 직전 종료 시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
			if (prev_end_time <= x.first) {
				prev_end_time = x.second;
				ans++;
			}
		}

		System.out.println(ans);

		sc.close();
	}

	static class Pair {
		private int first;
		private int second;

		public Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}

}
