package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 제리와 톰
 * url : https://www.acmicpc.net/problem/16430
 * 
 * @author kimsihwan
 *
 */
public class BOJ_16430 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int p = sc.nextInt();

		System.out.println(p-q + " " + p);
		sc.close();
	}
}
