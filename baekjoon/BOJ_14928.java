package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 큰 수 (BIG)
 * url : https://www.acmicpc.net/problem/14928
 * 
 * @author kimsihwan
 *
 */
public class BOJ_14928 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		long remain = 0l;
		for (int i = 0; i < N.length(); i++) {
			remain = (remain * 10 + (N.charAt(i) - '0')) % 20000303;
		}
		System.out.println(remain);
		sc.close();
	}
}
