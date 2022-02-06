package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 특별한 날
 * url : https://www.acmicpc.net/problem/10768
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10026 {

	Scanner sc = new Scanner(System.in);

	int month = sc.nextInt();
	int days = sc.nextInt();

	if (month < 2) {
		System.out.println("Before");
	} else if (month > 2) {
		System.out.println("After");
	} else if (days > 18) {
		System.out.println("After");
	} else if (days < 18) {
		System.out.println("Before");
	} else if (days == 18) {
		System.out.println("Special");
	}
	sc.close();

}
