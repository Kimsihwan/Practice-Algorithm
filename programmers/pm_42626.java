package programmers;

import java.util.PriorityQueue;

public class pm_42626 {

    public int solution(int[] scoville, int K) {

        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int v : scoville){
            queue.offer(v);
        }

        while(queue.peek() <= K){
            if(queue.size() == 1) return -1;
            Integer firstSv = queue.poll();
            Integer secondSv = queue.poll();

            Integer totalSv = firstSv + (secondSv * 2);
            queue.offer(totalSv);

            answer++;
        }

        return answer;
    }
}
