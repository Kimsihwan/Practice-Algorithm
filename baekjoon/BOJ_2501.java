package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 약수 구하기
 * url : https://www.acmicpc.net/problem/2501
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2501 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) K--;
			
			if(K == 0) {
				System.out.println(i);
				break;
			}
		}
		
		if(K !=0) System.out.println(0);
		sc.close();
	}
}
