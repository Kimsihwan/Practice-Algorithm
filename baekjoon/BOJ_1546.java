package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 평균
 * url : https://www.acmicpc.net/problem/1546
 * 
 * @author kimsihwan
 *
 */
public class BOJ_1546 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		double arr[] = new double[tc];

		double max = -1;
		for (int i = 0; i < tc; i++) {
			double n = sc.nextDouble();
			if (max < n) {
				max = n;
			}
			arr[i] = n;
		}

		double sum = 0;
		for (double n : arr) {
			sum += n / max * 100;
		}

		System.out.println(sum / tc);
		sc.close();
	}
}
