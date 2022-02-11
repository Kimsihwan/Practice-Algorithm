package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : GCD 합
 * url : https://www.acmicpc.net/problem/9613
 * 
 * @author kimsihwan
 *
 */
public class BOJ_9613 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		while (T-- > 0) {
			int N = sc.nextInt();
			List<Long> list = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				list.add(sc.nextLong());
			}

			long sum = 0;
			for (int i = 0; i <= N; i++) {
				for (int j = i + 1; j < N; j++) {
					sum += gcd(list.get(i), list.get(j));
				}
			}
			System.out.println(sum);
		}

		sc.close();
	}

	static long gcd(long a, long b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}

}
