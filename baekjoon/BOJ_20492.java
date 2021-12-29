package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 세
 * url : https://www.acmicpc.net/problem/20492
 * 
 * @author kimsihwan
 *
 */
public class BOJ_20492 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double a = N * 0.78;
		double b = N - (N * 0.2 * 0.22);
		System.out.println((int) a + " " + (int) b);
		sc.close();
	}
}
