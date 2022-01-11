package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 이름 : AC
 * url : https://www.acmicpc.net/problem/5430
 * 
 * @author kimsihwan
 *
 */
public class BOJ_5430 {

	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Deque<Integer> deque;
		StringTokenizer st;

		int tc = sc.nextInt();

		while (tc-- > 0) {
			String command = sc.next();
			int n = sc.nextInt();

			st = new StringTokenizer(sc.next(), "[],");

			deque = new ArrayDeque<Integer>();

			for (int i = 0; i < n; i++) {
				deque.add(Integer.parseInt(st.nextToken()));
			}

			AC(command, deque);
		}
		System.out.println(sb);
		sc.close();
	}

	private static void AC(String command, Deque<Integer> deque) {
		boolean isRight = true;

		for (char cmd : command.toCharArray()) {

			if (cmd == 'R') {
				isRight = !isRight;
				continue;
			}

			if (isRight) {

				if (deque.pollFirst() == null) {
					sb.append("error\n");
					return;
				}
			} else {
				if (deque.pollLast() == null) {
					sb.append("error\n");
					return;
				}
			}
		}

		makePrintString(deque, isRight);

	}

	private static void makePrintString(Deque<Integer> deque, boolean isRight) {
		sb.append('[');

		if (deque.size() > 0) {
			if (isRight) {
				sb.append(deque.pollFirst());
				while (!deque.isEmpty()) {
					sb.append(',').append(deque.pollFirst());
				}
			} else {
				sb.append(deque.pollLast());
				while (!deque.isEmpty()) {
					sb.append(',').append(deque.pollLast());
				}
			}
		}

		sb.append(']').append('\n');
	}
}
