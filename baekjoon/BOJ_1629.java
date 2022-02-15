package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 곱셈
 * url : https://www.acmicpc.net/problem/1629
 * 
 * @author kimsihwan
 *
 */
public class BOJ_1629 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long m = sc.nextLong();

		System.out.println(pow(a, b, m));

		sc.close();
	}

	static long pow(long a, long b, long c) {

		if (b == 1)
			return a % c;
		long val = pow(a, b / 2, c);
		val = val * val % c;
		if (b % 2 == 0)
			return val;
		return val * a % c;
	}

}
