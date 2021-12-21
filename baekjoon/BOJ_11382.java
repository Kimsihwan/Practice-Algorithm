package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 꼬마 정민
 * url : https://www.acmicpc.net/problem/11382
 * 
 * @author kimsihwan
 *
 */
public class BOJ_11382 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger c = sc.nextBigInteger();
		System.out.println(a.add(b).add(c));
		sc.close();
	}
}
