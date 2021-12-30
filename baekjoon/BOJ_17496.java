package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 스타후르츠
 * url : https://www.acmicpc.net/problem/17496
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10170 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int C = sc.nextInt();
		int P = sc.nextInt();

		int cnt = 0;
		int day = 1 + T;

		while (day <= N) {
			cnt += C;
			day += T;
		}

		System.out.println(cnt * P);

		sc.close();
	}
}
