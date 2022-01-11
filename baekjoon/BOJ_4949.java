package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

/**
 * 이름 : 균형잡힌 세상
 * url : https://www.acmicpc.net/problem/4949
 * 
 * @author kimsihwan
 *
 */
public class BOJ_4949 {

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nextLine = sc.nextLine();
		while (!nextLine.equals(".")) {
			makePrint(nextLine.toCharArray());
			nextLine = sc.nextLine();
		}
		System.out.println(sb);
		sc.close();
	}

	private static void makePrint(char[] arr) {
		Stack<Character> st = new Stack<Character>();
		for (char ch : arr) {
			if (ch == '(') {
				st.push(ch);
			} else if (ch == '[') {
				st.push(ch);
			} else if (ch == ')') {
				if (st.isEmpty()) {
					sb.append("no").append('\n');
					return;
				} else {
					if (st.peek() == '(') {
						st.pop();
					} else {
						sb.append("no").append('\n');
						return;
					}
				}
			} else if (ch == ']') {
				if (st.isEmpty()) {
					sb.append("no").append('\n');
					return;
				} else {
					if (st.peek() == '[') {
						st.pop();
					} else {
						sb.append("no").append('\n');
						return;
					}
				}
			}
		}

		if (st.isEmpty()) {
			sb.append("yes").append('\n');
		} else {
			sb.append("no").append('\n');
		}
	}
}
