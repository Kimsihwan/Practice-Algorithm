package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 이름 : 큐 2
 * url : https://www.acmicpc.net/problem/18258
 * 
 * @author kimsihwan
 *
 */
public class BOJ_18258 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Queue<Integer> q = new LinkedList<>();
		int back = -1;
		for (int i = 0; i < N; i++) {
			String rl = br.readLine();
			StringTokenizer st = new StringTokenizer(rl);
			switch (st.nextToken()) {
			case "push":
				int value = Integer.parseInt(st.nextToken());
				back = value;
				q.add(value);
				break;
			case "pop":
				if (q.isEmpty()) {
					bw.append("-1").append("\n");
				} else {
					bw.append(q.remove().toString()).append("\n");
				}
				break;
			case "size":
				bw.append(Integer.toString(q.size())).append("\n");
				break;
			case "empty":
				if (q.isEmpty()) {
					bw.append("1").append("\n");
				} else {
					bw.append("0").append("\n");
				}
				break;
			case "front":
				Integer peek = q.peek();
				if (peek == null) {
					bw.append("-1").append("\n");
				} else {
					bw.append(peek.toString()).append("\n");
				}
				break;
			case "back":
				if (q.isEmpty()) {
					bw.append("-1").append("\n");
				} else {
					bw.append(Integer.toString(back)).append("\n");
				}
				break;
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
