package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : N-Queen
 * url : https://www.acmicpc.net/problem/9663
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10026 {

	static int[] arr;
	static int N; // 체크판의 크기
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		nQueen(0);
		System.out.println(count);
		sc.close();
	}

	static void nQueen(int depth) {

		// 행을 다 채울 경우 카운트 1 증가 후 리턴
		if (depth == N) {
			count++;
			return;
		}

		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			// possibility() 해당 열에서 i번째 행에 놓을 수 있는지 검사하는 함수
			if (possibility(depth)) {
				nQueen(depth + 1);
			}
		}
	}

	// 놓은 위치가 다른 퀸으로부터 위협받는지를 검사하는 조건문
	static boolean possibility(int col) {
		for (int i = 0; i < col; i++) {
			// 해당 열의 행과 i열의 행이 일치할경우(같은 행에 존재할 경우)
			if(arr[col] == arr[i]) {
				return false;
			}
			
			/**
			 * 대각선상에 놓여있는 경우
			 * (열의 차와 행의 차가 같을 경우가 대각션에 놓여있느 경우다)
			 */
			else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		return true;
	}

}