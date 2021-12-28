package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 수학은 체육과목 입니다
 * url : https://www.acmicpc.net/problem/15894
 * 
 * @author kimsihwan
 *
 */
public class BOJ_15894 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		System.out.println(A.add(B));
		sc.close();
	}
}
