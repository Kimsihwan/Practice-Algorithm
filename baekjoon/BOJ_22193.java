package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : Multiply
 * url : https://www.acmicpc.net/problem/22193
 * 
 * @author kimsihwan
 *
 */
public class BOJ_22193 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		BigInteger c = sc.nextBigInteger();
		BigInteger d = sc.nextBigInteger();
		System.out.println(c.multiply(d));
		sc.close();
	}
}
