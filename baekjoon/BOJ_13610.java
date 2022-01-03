package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : Volta
 * url : https://www.acmicpc.net/problem/13610
 * 
 * @author kimsihwan
 *
 */
public class BOJ_13610 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int i = 1;
		for (; (y - x) * i < y; i++);
		
		System.out.println(i);
		sc.close();
	}
}
