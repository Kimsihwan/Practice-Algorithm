package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

/**
 * 이름 : 쇠막대기
 * url : https://www.acmicpc.net/problem/10799
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10799 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] charArray = sc.next().toCharArray();

		Stack<Integer> st = new Stack<Integer>();
		int result = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '(') {
				st.push(i);
			} else {
				if (st.peek() == i - 1) {
					st.pop();
					result += st.size();
				} else {
					st.pop();
					result++;
				}
			}
		}

		System.out.println(result);
		sc.close();
	}
}
