package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 알람 시계
 * url : https://www.acmicpc.net/problem/2884
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2884 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt() * 60;
		int m = sc.nextInt();

		int sum = h + m - 45;

		if (sum % 60 < 0) {
			System.out.println(23 + " " + (60 + (sum % 60)));
		} else {
			System.out.println(((sum) / 60) + " " + (sum) % 60);
		}

		sc.close();
	}
}
