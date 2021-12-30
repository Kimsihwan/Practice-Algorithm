package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 음
 * url : https://www.acmicpc.net/problem/2920
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2920 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}

		String rs = "";
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1] - 1) {
				rs = "ascending";
			} else if (arr[i] == arr[i + 1] + 1) {
				rs = "descending";
			} else {
				rs = "mixed";
				break;
			}
		}
		System.out.println(rs);
		sc.close();
	}
}
