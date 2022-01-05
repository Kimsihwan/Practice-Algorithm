package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 더하기 사이클
 * url : https://www.acmicpc.net/problem/1110
 * 
 * @author kimsihwan
 *
 */
public class BOJ_1110 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int copy = N;
		int count = 0;
		do {
			N = ((N%10)*10) + (((N/10)+(N%10)) % 10);
			count++;
		} while (copy != N);
		
		System.out.println(count);
		sc.close();
	}
}
