package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 1998년생인 내가 태국에서는 2541년생?!
 * url : https://www.acmicpc.net/problem/18108
 * 
 * @author kimsihwan
 *
 */
public class BOJ_18108 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		System.out.println(y-543);
		sc.close();
	}
}
