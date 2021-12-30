package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 두 수 비교하기
 * url : https://www.acmicpc.net/problem/1330
 * 
 * @author kimsihwan
 *
 */
public class BOJ_1330 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String rs = null;
		if(a == b) {
			rs = "==";
		} else if(a < b) {
			rs = "<";
		} else if(a > b) {
			rs = ">";
		}
		
		System.out.println(rs);
		sc.close();
	}
}
