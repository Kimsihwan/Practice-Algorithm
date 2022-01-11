package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 이름 : 회전하는 큐
 * url : https://www.acmicpc.net/problem/1021
 * 
 * @author kimsihwan
 *
 */
public class BOJ_1021 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		LinkedList<Integer> dq = new LinkedList<>();

		int count = 0;

		for (int i = 1; i <= N; i++) {
			dq.offer(i);
		}

		for (int i = 1; i <= M; i++) {
			int value = sc.nextInt();
			int targetIdx = dq.indexOf(value);
			int halfIdx;

			if (dq.size() % 2 == 0) {
				halfIdx = dq.size() / 2 - 1;
			} else {
				halfIdx = dq.size() / 2;
			}

			if (targetIdx <= halfIdx) {
				for (int j = 0; j < targetIdx; j++) {
					int temp = dq.pollFirst();
					dq.offerLast(temp);
					count++;
				}
			} else {
				
				//
				for (int j = 0; j < dq.size() - targetIdx; j++) {
					int temp = dq.pollLast();
					dq.offerFirst(temp);
					count++;
				}
			}
			dq.pollFirst();
		}

		System.out.println(count);
		sc.close();
	}
}
