package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 상근이의 친구들
 * url : https://www.acmicpc.net/problem/5717
 * 
 * @author kimsihwan
 *
 */
public class BOJ_5717 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) {
				break;
			}
			
			System.out.println(n+m);
		}

		sc.close();
	}

}
