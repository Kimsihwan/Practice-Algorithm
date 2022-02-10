package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 최대공약수와 최소공배수
 * url : https://www.acmicpc.net/problem/2609
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = gcd(a, b);
		int lcm = (a * b) / gcd;
		System.out.println(gcd);
		System.out.println(lcm);
		sc.close();
	}

	static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}

	}
}