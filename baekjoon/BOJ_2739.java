package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 구구단
 * url : https://www.acmicpc.net/problem/2739
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2739 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			sb.append(n + " * " + i + " = " + n * i);
			sb.append('\n');
		}
		System.out.println(sb);
		sc.close();
	}
}
