package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 달달함이 넘쳐흘러
 * url : https://www.acmicpc.net/problem/17256
 * 
 * @author kimsihwan
 *
 */
public class BOJ_17256 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int ax = sc.nextInt();
		int ay = sc.nextInt();
		int az = sc.nextInt();
		int cx = sc.nextInt();
		int cy = sc.nextInt();
		int cz = sc.nextInt();

		System.out.println((cx - az) + " " + (cy / ay) + " " + (cz - ax));
		sc.close();
	}
}
