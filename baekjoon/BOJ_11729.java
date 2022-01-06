package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 하노이 탑 이동 순서
 * url : https://www.acmicpc.net/problem/11729
 * 
 * @author kimsihwan
 *
 */
public class BOJ_11729 {

	static StringBuilder sb = new StringBuilder();
	static int count;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		hanoi(N, 1, 3, 2);
		
		System.out.println(count);
		System.out.println(sb);
		sc.close();
	}

	private static void hanoi(int n, int startPeg, int endPeg, int otherPeg) {
		if(n == 1) {
			moveDisk(startPeg, endPeg);
		} else {
			hanoi(n - 1, startPeg, otherPeg, endPeg);
			moveDisk(startPeg, endPeg);
			hanoi(n - 1, otherPeg, endPeg, startPeg);
		}
	}

	private static void moveDisk(int startPeg, int endPeg) {
		count++;
		sb.append(startPeg +" " + endPeg).append("\n");
	}
}
