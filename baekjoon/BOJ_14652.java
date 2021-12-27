package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 나는 행복합니다~
 * url : https://www.acmicpc.net/problem/14652
 * 
 * @author kimsihwan
 *
 */
public class BOJ_14652 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		if (m <= k) {
			System.out.println((k / m) + " " + k % m);
		} else {
			System.out.println(0 + " " + k);
		}
		sc.close();
	}
}
