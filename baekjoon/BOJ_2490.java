package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 이름 : 윷놀이
 * url : https://www.acmicpc.net/problem/2490
 * 
 * @author kimsihwan
 *
 */
public class BOJ_1012 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int total = 0;
			for(int j = 0; j < 4; j++) {
				total += Integer.parseInt(st.nextToken());
			}
			
			if(total == 0) {
				System.out.println("D");
			} else if(total == 4) {
				System.out.println("E");
			} else if(total == 1) {
				System.out.println("C");
			} else if(total == 2) {
				System.out.println("B");
			} else if(total == 3) {
				System.out.println("A");
			}
		}
	}

}