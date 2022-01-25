package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 찾기
 * url : https://www.acmicpc.net/problem/1786
 * 
 * @author kimsihwan
 *
 */
public class BOJ_1786 {

	static String t, p;
	static int[] pi;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		t = br.readLine();
		p = br.readLine();

		pi = new int[p.length()];

		getPi();

		KMP();

	}

	static void getPi() {
		int j = 0;

		for (int i = 1; i < p.length(); i++) {

			while (j > 0 && p.charAt(i) != p.charAt(j)) {
				j = pi[j - 1];
			}

			if (p.charAt(i) == p.charAt(j)) {
				pi[i] = ++j;
			}
		}
	}

	static void KMP() throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int j = 0;

		int cnt = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < t.length(); i++) {
			while (j > 0 && t.charAt(i) != p.charAt(j)) {
				j = pi[j - 1];
			}

			if (t.charAt(i) == p.charAt(j)) {

				if (j == p.length() - 1) {
					cnt++;
					list.add(i - j +1);
					j = pi[j];
				} else {
					++j;
				}
			}
		}

		bw.append(cnt + "");
		bw.newLine();
		for (Integer s : list) {
			bw.append(s + " ");
		}

		bw.flush();
		bw.close();
	}

}