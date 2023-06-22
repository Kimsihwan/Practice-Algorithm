package programmers;

import java.util.*;

public class pm_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();

        int[] works = new int[progresses.length];

        for(int i = 0; i < progresses.length; i++) {
            works[i] = (100-progresses[i])/speeds[i];
            if((100-progresses[i]) % speeds[i] != 0) {
                works[i]++;
            }
        }

        int before = works[0];
        int count = 1;
        for(int i = 1; i < works.length; i++){
            if(before >= works[i]) {
                count++;
            } else {
                list.add(count);
                count = 1;
                before = works[i];
            }
        }

        list.add(count);


        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
