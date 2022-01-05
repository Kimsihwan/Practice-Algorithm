package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 이름 : 팩토리얼 
 * url : https://www.acmicpc.net/problem/10872
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(recursive(N));
		sc.close();
	}

	public static int recursive(int val) {

		if (val == 0 || val == 1) {
			return 1;
		}

		return val * recursive(val - 1);
	}

	public static int recursive(int val) {

		int rs = 1;
		for (int i = 1; i < val + 1; i++) {
			rs *= i;
		}

		return rs;

	}
}
