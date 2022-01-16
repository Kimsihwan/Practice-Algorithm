package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 과자
 * url : https://www.acmicpc.net/problem/10156
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10156 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();		

		if (k * n <= m) {
			System.out.println(0);
		} else {
			System.out.println(Math.abs((k * n) - m));
		}

		sc.close();
	}
}
