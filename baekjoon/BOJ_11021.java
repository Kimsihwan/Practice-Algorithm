package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : A+B - 7
 * url : https://www.acmicpc.net/problem/11021
 * 
 * @author kimsihwan
 *
 */
public class BOJ_11021 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			System.out.println("Case #" + i + ": " + sum);
		}
		sc.close();
	}
}
