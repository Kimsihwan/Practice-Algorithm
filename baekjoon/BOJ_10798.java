package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 이름 : 세로읽기
 * url : https://www.acmicpc.net/problem/10798
 * 
 * @author kimsihwan
 *
 */
public class BOJ_10026 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = new String[5];
		
		for(int i = 0; i <5; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i = 0 ; i < 15; i++) {
			for(int j = 0 ; j < arr.length; j++) {
				if(i < arr[j].length()) {
					System.out.print(arr[j].charAt(i));
				}
			}
		}

}