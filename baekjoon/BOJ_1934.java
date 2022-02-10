package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 최소공배수
 * url : https://www.acmicpc.net/problem/1934
 * 
 * @author kimsihwan
 *
 */
public class BOJ_1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();

		while (tc-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int gcd = gcd(b, a);
			System.out.println((a * b) / gcd);
		}

		sc.close();
	}

	static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}

		return gcd(b, a % b);
	}
}
