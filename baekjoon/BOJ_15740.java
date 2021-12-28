package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : A+B - 9
 * url : https://www.acmicpc.net/problem/15740
 * 
 * @author kimsihwan
 *
 */
public class BOJ_15740 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		System.out.println(A.add(B));
		sc.close();
	}
}
