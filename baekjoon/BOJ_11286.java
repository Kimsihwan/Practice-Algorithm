import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

import static java.lang.Math.*;

/**
 * 이름 : 절댓값 힙
 * url : https://www.acmicpc.net/problem/11286
 * 
 * @author kimsihwan
 *
 */
public class BOJ_11286 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				int a = abs(o1);
				int b = abs(o2);
				if(a == b){
					return o1-o2;
				} else{
					return a-b;
				}
			}
		});
		while(N-- > 0) {
			Integer input = Integer.valueOf(br.readLine());
			if(input == 0) {
				if(pq.isEmpty()){
					System.out.println(0);
				}else{
					System.out.println(pq.poll());
				}
			}else{
				pq.offer(input);
			}
		}
	}

}
