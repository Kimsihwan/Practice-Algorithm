package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : OX퀴즈
 * url : https://www.acmicpc.net/problem/8958
 * 
 * @author kimsihwan
 *
 */
public class BOJ_8958 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			String[] arr = sc.next().split("");
			int ps = 1;
			int rs = 0;
			for (String str : arr) {
				if (!str.equals("X")) {
					rs += ps;
					ps++;
				} else {
					ps = 1;
				}
			}
			System.out.println(rs);
		}
		sc.close();
	}
}
