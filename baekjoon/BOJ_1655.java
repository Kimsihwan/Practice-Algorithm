import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_1655 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // min 오름차순
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1, o2) -> o1-o2);
        // max 내림차순
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2) -> o2-o1);

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(N-- > 0) {
            int value = Integer.parseInt(br.readLine());
            if(minHeap.size() == maxHeap.size()) {
                maxHeap.offer(value);
            } else {
                minHeap.offer(value);
            }

            if(!maxHeap.isEmpty() && !minHeap.isEmpty()) {
                if(minHeap.peek() < maxHeap.peek()) {
                    int tmp = minHeap.poll();
                    minHeap.offer(maxHeap.poll());
                    maxHeap.offer(tmp);
                }
            }
            sb.append(maxHeap.peek() + "\n");
        }

        System.out.println(sb);
    }
}