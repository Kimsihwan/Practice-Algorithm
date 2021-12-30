package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 이름 : Site Score
 * url : https://www.acmicpc.net/problem/20254
 * 
 * @author kimsihwan
 *
 */
public class BOJ_20254 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int UR = sc.nextInt();
		int TR = sc.nextInt();
		int UO = sc.nextInt();
		int TO = sc.nextInt();
		System.out.println((UR*56) + (TR*24) + (UO*14) + (6*TO));
		sc.close();
	}
}
