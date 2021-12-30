package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 상수
 * url : https://www.acmicpc.net/problem/2908
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2908 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		Integer aI = Integer.valueOf(new StringBuilder(a).reverse().toString());
		Integer bI = Integer.valueOf(new StringBuilder(b).reverse().toString());
		System.out.println(aI > bI ? aI : bI);
		sc.close();
	}
}
