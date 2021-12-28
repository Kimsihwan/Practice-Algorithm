package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 이름 : 조별과제를 하려는데 조장이 사라졌다
 * url : https://www.acmicpc.net/problem/15727
 * 
 * @author kimsihwan
 *
 */
public class BOJ_15727 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int rs = N / 5;
		int remain = N % 5;
		System.out.println(remain > 0 ? rs + 1 : rs);
		sc.close();
	}
}
