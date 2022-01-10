package baekjoon;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 큐
 * url : https://www.acmicpc.net/problem/10845
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10845 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();

		Queue<Integer> q = new LinkedList<>();
		int back = -1;
		for (int i = 0; i < N; i++) {
			String command = sc.next();
			switch (command) {
			case "push":
				int value = sc.nextInt();
				back = value;
				q.add(value);
				break;
			case "pop":
				if (q.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(q.remove()).append("\n");
				}
				break;
			case "size":
				sb.append(q.size()).append("\n");
				break;
			case "empty":
				if(q.isEmpty()) {
					sb.append("1").append("\n");
				} else {
					sb.append("0").append("\n");
				}
				break;
			case "front":
				Integer peek = q.peek();
				if(peek == null) {
					sb.append("-1").append("\n");
				} else {
					sb.append(peek).append("\n");
				}
				break;
			case "back":
				if(q.isEmpty()) {
					sb.append("-1").append("\n");
				} else {
					sb.append(back).append("\n");
				}
				break;
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
