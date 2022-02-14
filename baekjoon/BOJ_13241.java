package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 최소공배수
 * url : https://www.acmicpc.net/problem/13241
 * 
 * @author kimsihwan
 *
 */
public class BOJ_13241 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		
		sc.close();
		System.out.println((a*b)/gcb(a, b));
	}
	
	static long gcb(long a, long b) {
		if (a % b == 0) {
			return b;
		} else {
			return gcb(b, a % b);
		}
	}

}
