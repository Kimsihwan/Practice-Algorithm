package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 이름 : Darius님 한타 안 함?
 * url : https://www.acmicpc.net/problem/20499
 * 
 * @author kimsihwan
 *
 */
public class BOJ_20499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] kda = sc.next().split("/");

		int ka = Integer.parseInt(kda[0])  + Integer.parseInt(kda[2]);
		int d = Integer.parseInt(kda[1]);
		System.out.println((ka < d  || d == 0) ? "hasu" : "gosu");

		sc.close();
	}
}
