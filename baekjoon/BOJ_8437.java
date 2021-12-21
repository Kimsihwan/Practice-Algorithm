package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : Julka
 * url : https://www.acmicpc.net/problem/8437
 * 
 * @author kimsihwan
 *
 */
public class BOJ_8437 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();

		BigInteger x = (a.subtract(b)).divide(BigInteger.valueOf(2l));
		System.out.println(x.add(b));
		System.out.println(x);
		sc.close();
	}
}
