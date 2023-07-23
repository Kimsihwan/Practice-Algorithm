import java.util.Scanner;

import java.util.*;
import java.io.*;

public class BOJ_1781 {
    // 1. 데드라인과 컵라면 수를 각각 변수로 가진 클래스 생성
    // 2. for문 탐색으로 input 입력 시 클래스 인스턴스 생성해서 별도 Array에 저장
    // 3. Arrays.sort()
    // 4. 우선 큐 생성(MinHeap)
    // 5. Arrays for문 탐색하면서 우선순위 큐 원소 개수가 현재 index의 데드라인보다 작으면 바로 집어넣기
    // 5-2. 만약 데드라인과 같은 우선순위큐 원소 개수가 같으면 peek해서 열어본 컵라면 개수와 비교
    // 5-3. 현재 문제의 컵라면 보상이 크면 poll한 후 해당 컵라면 개수를 넣집어넣기
    // 6. 우선순위 큐 원소 전부 꺼내면서 컵라면 갯수 세기

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        Quest[] questArr = new Quest[N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int deadLine = Integer.parseInt(st.nextToken());
            int cupNoodleCount = Integer.parseInt(st.nextToken());
            questArr[i] = new Quest(deadLine, cupNoodleCount);
        }

        Arrays.parallelSort(questArr);



        // 오름차순
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o1-o2);

        // O(n)
        for(Quest quest : questArr) {
            if(pq.size() < quest.deadLine) {
                pq.offer(quest.cupNoodleCount);
            }
            else if(pq.size() == quest.deadLine) {
                if(pq.peek() < quest.cupNoodleCount) {
                    pq.poll();
                    pq.offer(quest.cupNoodleCount);
                }
            }
        }

        long nowCupNoodleCnt = 0l;
        while(!pq.isEmpty()) {
            nowCupNoodleCnt += pq.poll();
        }

        System.out.println(nowCupNoodleCnt);

    }

    static class Quest implements Comparable<Quest> {
        int deadLine;
        int cupNoodleCount;

        Quest(int deadLine, int cupNoodleCount) {
            this.deadLine = deadLine;
            this.cupNoodleCount = cupNoodleCount;
        }

        @Override
        public int compareTo(Quest o) {
            // 1. 데드라인 낮은 순
            // 2. 컵라면 개수 높은 순
            if(this.deadLine < o.deadLine) {
                return -1;
            } else if(this.deadLine == o.deadLine) {
                if(this.cupNoodleCount < o.cupNoodleCount) {
                    return 1;
                } else if(this.cupNoodleCount == o.cupNoodleCount) {
                    return 0;
                } else {
                    return -1;
                }
            } else {
                return 1;
            }
        }
    }
}