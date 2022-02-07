package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 뉴비의 기준은 뭘까? 
 * url : https://www.acmicpc.net/problem/19944
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10026 {

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int m = sc.nextInt();

	if (m == 1 || m == 2) {
		System.out.println("NEWBIE!");
	} else if (2 < m && m <= n) {
		System.out.println("OLDBIE!");
	} else {
		System.out.println("TLE!");
	}

	sc.close();
}
