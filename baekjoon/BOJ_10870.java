package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 피보나치 수 5
 * url : https://www.acmicpc.net/problem/10870
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(fibonacci(N));
		sc.close();
	}

	/**
	 * 피보나치 수열이란
	 * 앞에 있는 두 수를 더하여 그 다음 수를 얻는 형식
	 * @param val
	 * @return
	 */
	public static int fibonacci(int val) {

		if (val == 0) {
			return 0;
		}

		if (val == 1) {
			return 1;
		}

		return fibonacci(val - 1) + fibonacci(val - 2);
	}
	
	public static int fibonacci(int val) {
		if (val == 0) {
			return 0;
		}

		if (val == 1) {
			return 1;
		}

		int fib = 0;
		int prepre = 0;
		int pre = 1;
		for (int i = 2; i < val + 1; i++) {
			fib = prepre + pre;
			prepre = pre;
			pre = fib;
		}
		return fib;
	}
}
