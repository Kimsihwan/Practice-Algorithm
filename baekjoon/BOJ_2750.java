package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 이름 : 구구단
 * url : https://www.acmicpc.net/problem/2739
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2739 {
	
	public static void ArraySort(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);

		for (int val : arr) {
			System.out.println(val);
		}
		sc.close();
	}

	public static void buubleSort(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		// Bubble sort
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int val : arr) {
			System.out.println(val);
		}
		sc.close();
	}

	public static void countingSort(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		/*
		 * range : -1000 ~ 1000 
		 * 0은 index[1000]을 의
		 */
		boolean[] arr = new boolean[2001];

		for (int i = 0; i < N; i++) {
			arr[sc.nextInt() + 1000] = true;
		}

		// 정렬 과정이 필요 없음

		for (int i = 0; i < 2001; i++) {
			if (arr[i]) {
				System.out.println(i - 1000);
			}
		}
		sc.close();
	}
}
