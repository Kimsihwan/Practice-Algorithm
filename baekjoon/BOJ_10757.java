package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 큰 수 A+B
 * url : https://www.acmicpc.net/problem/10757
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10757 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		System.out.println(a.add(b));
		sc.close();
	}
}
