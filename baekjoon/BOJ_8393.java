package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 합
 * url : https://www.acmicpc.net/problem/8393
 * 
 * @author kimsihwan
 *
 */
public class BOJ_8393 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		System.out.println((a + b + c + d) / 60);
		System.out.println((a + b + c + d) % 60);
		sc.close();
	}
}
