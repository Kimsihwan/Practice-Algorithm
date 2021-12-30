package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : A+B - 5
 * url : https://www.acmicpc.net/problem/10952
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10952 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while (a + b > 1) {
			System.out.println(a + b);
			a = sc.nextInt();
			b = sc.nextInt();
		}

		sc.close();
	}
}
