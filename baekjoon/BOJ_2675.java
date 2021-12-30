package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 문자열 반복
 * url : https://www.acmicpc.net/problem/2675
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2675 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			int R = sc.nextInt();
			String[] sArr = sc.next().split("");
			String rs = "";
			for (String s : sArr) {
				for (int j = 0; j < R; j++) {
					rs += s;
				}
			}
			System.out.println(rs);
		}
		sc.close();
	}
}
