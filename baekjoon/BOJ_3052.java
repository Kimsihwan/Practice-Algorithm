package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 이름 : 나머지
 * url : https://www.acmicpc.net/problem/3052
 * 
 * @author kimsihwan
 *
 */
public class BOJ_3052 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			int nextInt = sc.nextInt() % 42;
			map.put(nextInt, 1);
		}

		System.out.println(map.entrySet().size());

		sc.close();
	}
}
