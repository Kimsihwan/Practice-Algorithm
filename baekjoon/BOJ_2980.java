package baekjoon;

import java.io.IOException;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 이름 : 도로와 신호등
 * url : https://www.acmicpc.net/problem/2980
 * 
 * @author kimsihwan
 *
 */
public class BOJ_2980 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
	    int l =  Integer.parseInt(st.nextToken());
	    int t = 0;
	    int pre = 0;
	 
	    for (int i = 0; i < n; i++) {
	    	st = new StringTokenizer(br.readLine());
	        int d = Integer.parseInt(st.nextToken());
	        int r = Integer.parseInt(st.nextToken());
	        int g = Integer.parseInt(st.nextToken());
	 
	        // t - 위치 d에 있는 신호등까지 걸린 시간
	        t += d - pre;
	        pre = d;
	 
	        int red = t % (r + g);
	        if (red <= r) {
	            // 빨간 불이 끝날때까지 대기
	            t += r - red;
	        }
	    }
	    System.out.println(t + (l - pre));

	}

}
