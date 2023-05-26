package programmers;

import java.util.Arrays;

public class pm_42889 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        Node[] arr = new Node[N];

        int cnt = stages.length;
        for(int i = 1; i <= N; i++){
            int sum = 0;
            int tmp = cnt;
            for(int stage : stages) {
                if(stage == i) {
                    sum++;
                    cnt--;
                }
            }
            double a = (double) sum/tmp;
            arr[i-1] = new Node(i, a);
        }

        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                Node node1 = arr[i];
                Node node2 = arr[j];
                if(node1.getValue() < node2.getValue() || (node1.getValue() == node2.getValue() && node1.getIndex() > node2.getIndex())){
                    Node tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            answer[i] = arr[i].getIndex();
        }


        return answer;
    }

    class Node {
        private int index;
        private double value;

        public Node(int index, double value) {
            this.index = index;
            this.value = value;
        }

        public int getIndex() {return this.index;}
        public double getValue() {return this.value;}

        public String toString() {
            return "index: "+index+" "+"value: "+value;
        }
    }
}
