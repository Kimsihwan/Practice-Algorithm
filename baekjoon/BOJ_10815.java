package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 이름 : 숫자 카드
 * url : https://www.acmicpc.net/problem/10815
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10815 {

	static int[] arr;

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int target = sc.nextInt();
			if (isFind(target))
				bw.append("1 ");
			else
				bw.append("0 ");
		}
		bw.flush();
		sc.close();
	}

	static boolean isFind(int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (arr[mid] == target) {
				return true;
			}

			if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		return false;
	}
}
