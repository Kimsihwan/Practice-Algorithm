package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : R2
 * url : https://www.acmicpc.net/problem/3046
 * 
 * @author kimsihwan
 *
 */
public class BOJ_3046 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = br.readLine().split(" ");

		int r1 = Integer.parseInt(arr[0]);
		int s = Integer.parseInt(arr[1]);

		System.out.println((s * 2) - r1);
		br.close();
	}
}
