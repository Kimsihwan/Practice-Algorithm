

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 사파리월드
 * url : https://www.acmicpc.net/problem/2420
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2420 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextInt();
		System.out.println(Math.abs(N - M));
		sc.close();
	}
}
