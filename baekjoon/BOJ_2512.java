package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 예산
 * url : https://www.acmicpc.net/problem/2512
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2512 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		long m = sc.nextLong();

		int start = 0;
		int end = arr[arr.length - 1];
		int result = 0;
		while (start <= end) {
			long total = 0l;

			int mid = (start + end) / 2;

			for (int value : arr) {
				if (mid < value) {
					total += mid;
				} else {
					total += value;
				}
			}

			if (total > m) {
				end = mid - 1;
			} else {
				start = mid + 1;
				result = mid;
			}
		}

		System.out.println(result);
		sc.close();
	}
	
}
