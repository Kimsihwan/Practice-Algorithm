package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 시험 점수
 * url : https://www.acmicpc.net/problem/5596
 * 
 * @author kimsihwan
 *
 */
public class BOJ_5596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mkTotal = 0;
		for (int i = 0; i < 4; i++) {
			mkTotal += sc.nextInt();
		}
		
		int msTotal = 0;
		for (int i = 0; i < 4; i++) {
			msTotal += sc.nextInt();
		}
		
		System.out.println(Math.max(mkTotal, msTotal));
		
		sc.close();
	}

}
