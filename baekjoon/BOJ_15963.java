package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : CASIO
 * url : https://www.acmicpc.net/problem/15963
 * 
 * @author kimsihwan
 *
 */
public class BOJ_15963 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long m = sc.nextLong();
		
		System.out.println(n == m ? 1 : 0);

		sc.close();
	}
}
