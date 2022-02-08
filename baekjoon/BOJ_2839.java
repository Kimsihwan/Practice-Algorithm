package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 설탕 배달
 * url : https://www.acmicpc.net/problem/2839
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10026 {

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	int bong = 0;
	while (true) {
		if (n % 5 == 0) {
			bong += n / 5;
			System.out.println(bong);
			break;
		} else {
			n -= 3;
			bong++;
		}

		if (n < 0) {
			System.out.println("-1");
			break;
		}
	}

	sc.close();
}