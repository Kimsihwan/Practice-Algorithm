package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 알파벳 찾기
 * url : https://www.acmicpc.net/problem/10809
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10809 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.next().split("");

		int[] a1 = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1 };
		for (int i = 0; i < arr.length; i++) {
			String string = arr[i].toUpperCase();
			int a = string.charAt(0) - 65;
			if (a1[a] == -1) {
				a1[a] = i;
			}
		}

		for (int i = 0; i < 26; i++) {
			System.out.print(a1[i] + " ");
		}

		sc.close();
	}
}
