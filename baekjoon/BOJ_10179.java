package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 쿠폰
 * url : https://www.acmicpc.net/problem/10179
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10179 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			double d = sc.nextDouble() * 0.8;
			System.out.println("$"+String.format("%.2f", d));
		}

		sc.close();
	}

}
