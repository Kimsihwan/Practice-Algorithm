package programmers;

import java.util.*;

public class pm_138477 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            if(i < k) {
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(0);
            } else {
                list.add(score[i]);
                Collections.sort(list);
                answer[i] = list.get(list.size()-k);
            }
        }
        return answer;
    }
}
