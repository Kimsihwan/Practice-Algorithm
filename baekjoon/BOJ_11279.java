package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 이름 : 최대 힙
 * url : https://www.acmicpc.net/problem/11279
 *
 * @author kimsihwan
 *
 */
public class BOJ_11279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        while(n-- > 0) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                if(pq.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(pq.poll());
                }
            }else{
                pq.offer(input);
            }
        }

        br.close();
    }
}
