package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 한글 2
 * url : https://www.acmicpc.net/problem/11283
 * 
 * @author kimsihwan
 *
 */
public class BOJ_11283 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String next = sc.next();
		System.out.println((int) next.charAt(0) - 44031);
		sc.close();
	}
}
