import java.util.Scanner;



import java.util.*;
import java.io.*;

public class BOJ_1715  {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0) {
            pq.offer(Long.parseLong(br.readLine()));
        }

        long answer = 0;
        while(pq.size() > 1) {
            long first = pq.poll();
            long second = pq.poll();
            long sum = first + second;
            answer += sum;
            pq.offer(sum);
        }

        System.out.println(answer);
    }
}