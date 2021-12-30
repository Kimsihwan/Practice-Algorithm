package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : Rats
 * url : https://www.acmicpc.net/problem/18301
 * 
 * @author kimsihwan
 *
 */
public class BOJ_18301 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt() + 1;
		int n2 = sc.nextInt() + 1;
		int n12 = sc.nextInt() + 1;
		
		System.out.println(n1*n2/n12 - 1);
		sc.close();
	}
}
