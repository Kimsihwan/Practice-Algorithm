package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Main.Ant;

/**
 * 이름 : 개미
 * url : https://www.acmicpc.net/problem/3048
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10170 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();

		List<Ant> arrList = new ArrayList<>();

		String str1 = br.readLine();

		for (int i = str1.length() - 1; i >= 0; i--) {
			arrList.add(new Ant(str1.charAt(i), 1));
		}

		str1 = br.readLine();
		for (int i = 0; i < str1.length(); i++) {
			arrList.add(new Ant(str1.charAt(i), 2));
		}

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			for (int i = 0; i < arrList.size() - 1; i++) {
				Ant front = arrList.get(i);
				Ant back = arrList.get(i + 1);
				if (front.num != 2 && front.num != back.num) {
					arrList.set(i, back);
					arrList.set(i + 1, front);
					i++;
				}
			}
		}

		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i).name);
		}
	}

	static class Ant {
		private char name;
		private int num;

		public Ant(char name, int num) {
			this.name = name;
			this.num = num;
		}

		public char getName() {
			return name;
		}

		public void setName(char name) {
			this.name = name;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

	}
}
