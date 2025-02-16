import java.util.*;
import java.io.*;

public class BOJ_1966 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            String[] command = br.readLine().split(" ");

            // 문서 개수
            int N = Integer.parseInt(command[0]);

            // 찾고 싶은 문서 위치
            int M = Integer.parseInt(command[1]);

            Deque<Main.Document> queue = new ArrayDeque<>();

            // 중요도 내림차순
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            String[] arr = br.readLine().split(" ");
            for(int i = 0; i < N; i++) {
                int priority = Integer.parseInt(arr[i]);
                queue.add(new Main.Document(priority, i ));
                priorityQueue.add(priority);
            }

            // 인쇄 순서
            int count = 0;
            while(!queue.isEmpty()) {
                // 맨 앞 문서 꺼내기
                Main.Document current = queue.poll();

                if(current.priority == priorityQueue.peek()) {
                    // 가장 높은 중요도의 문서라면 인쇄
                    priorityQueue.poll();
                    count++;

                    if(current.index == M) {
                        bw.append(count+"\n");
                        break;
                    }
                } else {
                    // 중요도가 높은 문서가 남아 있다면 다시 큐에 넣음
                    queue.add(current);
                }
            }
        }

        br.close();
        bw.flush();
        bw.close();


    }

    static class Document {
        int priority;
        int index;

        Document(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }
}
