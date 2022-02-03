package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * 이름 : 수됴요금
 * url : https://www.acmicpc.net/problem/10707
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();

		int xTotal = a * p;
		int yTotal = p > c ? (((p - c) * d) + b) : b;

		System.out.println(xTotal > yTotal ? yTotal : xTotal);

		sc.close();
	}
}
