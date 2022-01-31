package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 연세대학교
 * url : https://www.acmicpc.net/problem/15680
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10026 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int val = sc.nextInt();
		
		if(val == 0) {
			System.out.println("YONSEI");
		} else {
			System.out.println("Leading the Way to the Future");
		}
		sc.close();
	}

}
