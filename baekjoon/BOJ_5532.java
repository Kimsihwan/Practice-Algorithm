package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 방학 숙제
 * url : https://www.acmicpc.net/problem/5532
 * 
 * @author kimsihwan
 *
 */
public class BOJ_5532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int totalA = 0;
		int totalB = 0;
		for (int i = 1; i <= l; i++) {
			
			if(a <= totalA && b <= totalB) {
				System.out.println((l - i) + 1);
				break;	
			}else {
				totalA = c * i;
				totalB = d * i;	
			}
		}
		sc.close();
	}
}
