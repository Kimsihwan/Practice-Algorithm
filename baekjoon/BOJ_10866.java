package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * 이름 : 덱
 * url : https://www.acmicpc.net/problem/10866
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		Deque<Integer> dq = new ArrayDeque<Integer>();
		for (int i = 0; i < N; i++) {
			String command = sc.next();
			switch (command) {
			case "push_front":
				dq.offerFirst(sc.nextInt());
				break;
			case "push_back":
				dq.offerLast(sc.nextInt());
				break;
			case "pop_front":
				if (dq.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(dq.pollFirst()).append("\n");
				}
				break;
			case "pop_back":
				if (dq.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(dq.pollLast()).append("\n");
				}
				break;
			case "size":
				sb.append(dq.size()).append("\n");
				break;
			case "empty":
				if (dq.isEmpty()) {
					sb.append("1").append("\n");
				} else {
					sb.append("0").append("\n");
				}
				break;
			case "front":
				if (dq.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(dq.peekFirst()).append("\n");
				}				
				break;
			case "back":
				if (dq.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(dq.peekLast()).append("\n");
				}
				break;
			default:
				break;
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
